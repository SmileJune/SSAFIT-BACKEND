package com.ssafy.ssafit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.ssafit.model.dto.Together;
import com.ssafy.ssafit.model.service.TogetherServiceImpl;
import com.ssafy.ssafit.util.JWTUtil;

@RestController
@RequestMapping("/api")
public class ApiTogetherController {
	
	@Autowired
	private TogetherServiceImpl TogetherService;
	
	@PostMapping("together/create")
	public void create(@RequestHeader("access-token") String token, @RequestBody Together together) {
		together.setUserId(JWTUtil.getUserIdByToken(token));
		TogetherService.createTogether(together);
	}
	
	@GetMapping("together")
	public List<Together> read() {
		return TogetherService.readTogether();
	}
	
}
