package com.ssafy.ssafit.model.dao;

import java.util.HashMap;
import java.util.List;

import com.ssafy.ssafit.model.dto.Video;

public interface VideoDao {
	//게시글 수정 update
	void updateBoard(Video video);
	//게시글 삭제 delete
	void deleteBoard(int id);
	//게시글 추가 insert
	void insertBoard(Video video);
	//게시글 조회 selectOne
	Video selectOne(int id);
	//게시글 목록 selectList
	List<Video> selectList();
}
