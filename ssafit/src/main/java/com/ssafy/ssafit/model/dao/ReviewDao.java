package com.ssafy.ssafit.model.dao;

import com.ssafy.ssafit.model.dto.Review;
import com.ssafy.ssafit.model.dto.Routine;

public interface ReviewDao {
	void insertReview(Review review);
	void insertRoutine(Routine routine);
}
