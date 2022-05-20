package com.ssafy.ssafit.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.ssafit.model.dao.ReviewDao;
import com.ssafy.ssafit.model.dto.Comment;
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

	@Override
	public void updateReview(Review review) {
		reviewDao.updateReview(review);
		for (Routine routine : review.getVideoList()) {
			routine.setReviewNo(review.getNo());
			reviewDao.updateRoutine(routine);
		}
	}

	@Override
	public List<Review> readReview() {
		List<Review> reviews = reviewDao.selectReviews();
		for (Review review : reviews) {
			review.setVideoList(reviewDao.selectRoutineByNo(review.getNo()));
			review.setCommentList(reviewDao.selectCommentByNo(review.getNo()));
		}
		return reviews;
	}

	@Override
	public void createComment(Comment comment) {
		reviewDao.insertComment(comment);
	}

	@Override
	public void deleteComment(int no) {
		reviewDao.deleteComment(no);
	}

	@Override
	public void updateComment(Comment comment) {
		reviewDao.updateComment(comment);
	}
}
