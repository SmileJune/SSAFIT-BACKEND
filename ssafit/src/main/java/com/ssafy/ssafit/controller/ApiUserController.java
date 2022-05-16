package com.ssafy.ssafit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.ssafit.model.dto.User;
import com.ssafy.ssafit.model.dto.Video;
import com.ssafy.ssafit.model.service.UserServiceImpl;

@RestController
@RequestMapping("/api")
public class ApiUserController {
	
	@Autowired
	private UserServiceImpl userService;

	@GetMapping("user/{id}")
	public User listOne(@PathVariable String id) {
		return userService.getUser(id);
	}
	@PostMapping("jjim")
	public void jjim(User user) {
		userService.insertJjim(user);
	}
	
	@DeleteMapping("jjim/delete")
	public void deleteJjim(User user) {
		userService.deleteJjim(user);
	}
	
	@GetMapping("jjim/list/{id}")
	public List<Video> listJjim(@PathVariable String id){
		return userService.listJjim(id);
	}
}
