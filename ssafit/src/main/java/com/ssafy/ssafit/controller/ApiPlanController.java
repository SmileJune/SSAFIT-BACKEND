package com.ssafy.ssafit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.ssafit.model.dto.Plan;
import com.ssafy.ssafit.model.service.PlanServiceImpl;

@RestController
@RequestMapping("/api")
public class ApiPlanController {

	@Autowired
	private PlanServiceImpl planServiceImpl;

	@PostMapping("plan/write")
	public void writePlan(@RequestBody Plan plan) {
		planServiceImpl.writePlan(plan);
	}
}
