package com.ssafy.ssafit.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.ssafit.model.dto.User;
import com.ssafy.ssafit.util.JWTUtil;

@RestController
@RequestMapping("/api")
public class LoginController {

	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";

	@Autowired
	private JWTUtil jwtUtil;

	@PostMapping("login")
	public ResponseEntity<Map<String, Object>> list(@RequestBody User user) {
		HttpStatus status = null;
		HashMap<String, Object> result = new HashMap<>();
		try {
			// user 정보를 이용해서 데이터베이스 확인
			// 존재하면 토큰을 생성해서 결과에 넣어서 반환
			if (user.getId() != null || user.getId().length() > 0) {
				result.put("auth-token", jwtUtil.createToken("user-id", user.getId()));
				result.put("message", SUCCESS);
				status = HttpStatus.ACCEPTED;
			} else {
				result.put("message", FAIL);
				status = HttpStatus.ACCEPTED;
			}
		} catch (Exception e) {
			e.printStackTrace();
			result.put("message", FAIL);
			status = HttpStatus.INTERNAL_SERVER_ERROR;
		}
		return new ResponseEntity<Map<String, Object>>(result, status);
	}
}
