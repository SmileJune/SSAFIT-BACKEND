package com.ssafy.ssafit.model.dao;

import java.util.List;

import com.ssafy.ssafit.model.dto.Together;

public interface TogetherDao {
	void insertTogether(Together together);
	List<Together> selectTogether();
}
