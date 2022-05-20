package com.ssafy.ssafit.model.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.ssafit.model.dao.VideoDao;
import com.ssafy.ssafit.model.dto.Condition;
import com.ssafy.ssafit.model.dto.Video;

@Service
public class VideoServiceImpl implements VideoService {

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
	public List<Video> getPlanVideos(List<Integer> somedayPlan) {
		List<Video> list = new ArrayList<>();
		for (int videoNo : somedayPlan) {
			list.add(VideoDao.selectOne(videoNo));
		}
		return list;
	}

}
