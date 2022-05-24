package com.ssafy.ssafit.model.service;

import java.util.List;

import com.ssafy.ssafit.model.dto.Together;

public interface TogetherService {
	void createTogether(Together together);
	List<Together> readTogether();
}
