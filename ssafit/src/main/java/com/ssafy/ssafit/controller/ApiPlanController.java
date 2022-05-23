package com.ssafy.ssafit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.ssafit.model.dto.Plan;
import com.ssafy.ssafit.model.dto.Video;
import com.ssafy.ssafit.model.service.PlanServiceImpl;
import com.ssafy.ssafit.util.JWTUtil;

@RestController
@RequestMapping("/api")
public class ApiPlanController {

	@Autowired
	private PlanServiceImpl planService;

	@PostMapping("plan/write")
	public void writePlan(@RequestHeader("access-token") String token,@RequestBody Plan plan) {
		plan.setUserId(JWTUtil.getUserIdByToken(token));
		planService.writePlan(plan);
	}
	
	@PostMapping("plan")
	public List<Video> getPlan(@RequestHeader("access-token") String token, @RequestBody Plan plan) {
		plan.setUserId(JWTUtil.getUserIdByToken(token));
		return planService.getPlan(plan);
	}
	
	@GetMapping("plan/user")
	public List<Plan> getPlanByUserId(@RequestHeader("access-token") String token){
		return planService.getPlanByUserId(JWTUtil.getUserIdByToken(token));
	}
}
