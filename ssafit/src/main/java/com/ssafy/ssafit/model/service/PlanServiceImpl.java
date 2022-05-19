package com.ssafy.ssafit.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.ssafit.model.dao.PlanDao;
import com.ssafy.ssafit.model.dto.Plan;

@Service
public class PlanServiceImpl implements PlanService{
	
	@Autowired
	private PlanDao planDao;

	@Override
	public void writePlan(Plan plan) {
		System.out.println(plan);
		planDao.deletePlan(plan);
		for(Integer videoNo : plan.getVideoList()) {
			Plan input = plan;
			input.setVideoNo(videoNo);
			planDao.insertPlan(plan);
		}

	}

}
