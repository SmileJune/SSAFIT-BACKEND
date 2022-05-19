package com.ssafy.ssafit.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.ssafit.model.dao.VideoDao;
import com.ssafy.ssafit.model.dto.Condition;
import com.ssafy.ssafit.model.dto.Plan;
import com.ssafy.ssafit.model.dto.Video;

@Service
public class VideoServiceImpl implements VideoService{
	
	@Autowired
	private VideoDao VideoDao;

	@Override
	public List<Video> getVideoList() {
		return VideoDao.selectList();
	}

	@Override
	public Video getVideo(int no) {
		return VideoDao.selectOne(no);
	}

	@Override
	public List<Video> getVideoListByPart(int partNo) {
		return VideoDao.selectListByPart(partNo);
	}

	@Override
	public List<Video> searchVideos(Condition condition) {
		return VideoDao.selectVideoByCondition(condition);
	}

	@Override
	public void writePlan(Plan plan) {
		System.out.println(plan);
		VideoDao.deletePlan(plan);
		for(Integer videoNo : plan.getVideoList()) {
			Plan input = plan;
			input.setVideoNo(videoNo);
			VideoDao.insertPlan(plan);
		}
	}
}
