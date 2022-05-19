package com.ssafy.ssafit.model.dao;

import java.util.List;

import com.ssafy.ssafit.model.dto.Condition;
import com.ssafy.ssafit.model.dto.Video;

public interface VideoDao {
	Video selectOne(int no);
	List<Video> selectList();
	List<Video> selectListByPart(int partNo);
	List<Video> selectVideoByCondition(Condition condition);
}
