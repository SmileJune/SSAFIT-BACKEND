package com.ssafy.ssafit.model.service;

import com.ssafy.ssafit.model.dto.Review;

public interface ReviewService {
	void createReview(Review review);
	void deleteReview(int no);
	void updateReview(Review review);
}
