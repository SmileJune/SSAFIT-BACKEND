package com.ssafy.ssafit.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.ssafit.model.dao.ReviewDao;
import com.ssafy.ssafit.model.dto.Review;
import com.ssafy.ssafit.model.dto.Routine;

@Service
public class ReviewServiceImpl implements ReviewService {

	@Autowired
	private ReviewDao reviewDao;

	@Override
	public void createReview(Review review) {
		// insertReview 하나랑
		// insertRoutine 여러개
		reviewDao.insertReview(review);
		for (Routine routine : review.getVideoList()) {
			routine.setReviewNo(review.getNo());
			reviewDao.insertRoutine(routine);
		}
	}

	@Override
	public void deleteReview(int no) {
		reviewDao.deleteReview(no);
	}
}
