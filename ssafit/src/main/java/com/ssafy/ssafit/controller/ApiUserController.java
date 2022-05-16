package com.ssafy.ssafit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.ssafit.model.dto.User;
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
}
