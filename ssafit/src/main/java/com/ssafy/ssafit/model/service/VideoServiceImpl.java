package com.ssafy.ssafit.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.ssafit.model.dao.VideoDao;
import com.ssafy.ssafit.model.dto.Video;

@Service
public class VideoServiceImpl implements VideoService{
	
	@Autowired
	private VideoDao VideoDao;

	@Override
	public void updateCnt(int id) {
		Video video = VideoDao.selectOne(id);
		video.setViewCnt(video.getViewCnt() + 1);
		VideoDao.updateBoard(video);
		
	}

	@Override
	public Video getVideoById(int id) {
		return VideoDao.selectOne(id);
	}

	@Override
	public Video readVideo(int id) {
		this.updateCnt(id);
		return VideoDao.selectOne(id);
	}

	@Override
	public List<Video> getVideoList() {
		return VideoDao.selectList();
	}
}
