package com.ssafy.ssafit.model.dao;

import com.ssafy.ssafit.model.dto.Plan;

public interface PlanDao {
	void deletePlan(Plan plan);
	void insertPlan(Plan plan);
}
