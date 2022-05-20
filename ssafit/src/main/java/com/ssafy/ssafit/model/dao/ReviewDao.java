package com.ssafy.ssafit.model.dao;

import com.ssafy.ssafit.model.dto.Review;
import com.ssafy.ssafit.model.dto.Routine;

public interface ReviewDao {
	void insertReview(Review review);
	void insertRoutine(Routine routine);
	void deleteReview(int no);
	
	void updateReview(Review review);
	void updateRoutine(Routine routine);
}
