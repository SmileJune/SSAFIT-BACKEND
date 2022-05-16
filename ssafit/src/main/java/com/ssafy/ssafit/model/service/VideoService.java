package com.ssafy.ssafit.model.service;

import java.util.List;

import com.ssafy.ssafit.model.dto.Video;

public interface VideoService {
	//조회수 증가
	void updateCnt(int id);
	//글 얻어오기
	Video getVideoById(int id);
	//글 읽기
	Video readVideo(int id);
	//모든게시물 조회
	List<Video> getVideoList();
}
