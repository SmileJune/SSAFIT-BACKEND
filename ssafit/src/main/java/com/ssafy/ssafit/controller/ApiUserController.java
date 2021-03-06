package com.ssafy.ssafit.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.ssafit.model.dto.Follow;
import com.ssafy.ssafit.model.dto.User;
import com.ssafy.ssafit.model.service.UserServiceImpl;
import com.ssafy.ssafit.util.JWTUtil;

@RestController
@RequestMapping("/api")
public class ApiUserController {

	private final String SUCCESS = "success";
	private final String FAIL = "fail";

	@Autowired
	private UserServiceImpl userService;

	@Autowired
	private JWTUtil jwtUtil;

	@PostMapping("/login")
	public ResponseEntity<Map<String, Object>> login(@RequestBody User user) {
		HttpStatus status = null;

		HashMap<String, Object> result = new HashMap<>();

		try {
			if (userService.isUser(user)) {
				result.put("access-token", jwtUtil.createToken("id", user.getId()));
				result.put("message", SUCCESS);
				status = HttpStatus.ACCEPTED;
			} else {
				result.put("message", FAIL);
				status = HttpStatus.ACCEPTED;
			}

		} catch (Exception e) {
			result.put("message", FAIL);
			status = HttpStatus.INTERNAL_SERVER_ERROR;
		}
		return new ResponseEntity<Map<String, Object>>(result, status);
	}

	@PostMapping("/join")
	public void join(@RequestBody User user) {
		userService.insertUser(user);
	}
	
	@PostMapping("user/identify")
	public boolean identify(@RequestHeader("access-token") String token, @RequestBody User user) {
		user.setId(JWTUtil.getUserIdByToken(token));
		return userService.isUser(user);
	}

	@GetMapping("user/{id}")
	public User listOne(@PathVariable String id) {
		return userService.getUser(id);
	}

	@GetMapping("user")
	public User getMyProfile(@RequestHeader("access-token") String token) {
		return userService.getUser(JWTUtil.getUserIdByToken(token));
	}
	
	@PutMapping("user/update")
	public void updateUser(@RequestHeader("access-token") String token, @RequestBody User user) {
		user.setId(JWTUtil.getUserIdByToken(token));
		userService.updateUser(user);
	}
	
	@DeleteMapping("user/delete")
	public void deleteUser(@RequestHeader("access-token") String token) {
		userService.deleteUser(JWTUtil.getUserIdByToken(token));
	}

	@GetMapping("follower/{id}")
	public List<User> listFollower(@PathVariable String id) {
		return userService.getFollower(id);
	}

	@GetMapping("following/{id}")
	public List<User> listFollowing(@PathVariable String id) {
		return userService.getFollowing(id);
	}

	@PostMapping("follow/write")
	public void writeFollow(@RequestHeader("access-token") String token, @RequestBody Follow follow) {
		follow.setFrom(JWTUtil.getUserIdByToken(token));
		userService.insertFollow(follow);
	}

	@DeleteMapping("follow/delete/{to}")
	public void deleteFollow(@RequestHeader("access-token") String token, @PathVariable String to) {
		Follow follow = new Follow();
		follow.setFrom(JWTUtil.getUserIdByToken(token));
		follow.setTo(to);
		userService.deleteFollow(follow);
	}
}
