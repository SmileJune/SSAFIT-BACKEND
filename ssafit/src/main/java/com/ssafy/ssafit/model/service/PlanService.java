package com.ssafy.ssafit.model.service;

import java.util.List;

import com.ssafy.ssafit.model.dto.Plan;
import com.ssafy.ssafit.model.dto.Video;

public interface PlanService {
	void writePlan(Plan plan);
	List<Video> getPlan(Plan plan);
	List<Plan> getPlanByUserId(String userId);
}
