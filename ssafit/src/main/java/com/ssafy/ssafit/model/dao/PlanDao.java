package com.ssafy.ssafit.model.dao;

import java.util.List;

import com.ssafy.ssafit.model.dto.Plan;
import com.ssafy.ssafit.model.dto.Video;

public interface PlanDao {
	void deletePlan(Plan plan);
	void insertPlan(Plan plan);
	List<Video> selectPlan(Plan plan);
}
