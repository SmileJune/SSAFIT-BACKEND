package com.ssafy.ssafit.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.ssafit.model.dao.ReviewDao;
import com.ssafy.ssafit.model.dto.Review;

@Service
public class ReviewServiceImpl implements ReviewService{
	
	@Autowired
	private ReviewDao reviewDao;

	@Override
	public List<Review> getReviewListByVideoNo(int videoNo) {
		return reviewDao.selectReviewByVideoNo(videoNo);
	}

	@Override
	public void createReview(Review review) {
		reviewDao.insertReview(review);
	}
}
