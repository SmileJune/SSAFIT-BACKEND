package com.ssafy.ssafit.model.service;

import java.util.List;

import com.ssafy.ssafit.model.dto.Comment;
import com.ssafy.ssafit.model.dto.Review;

public interface ReviewService {
	void createReview(Review review);
	void deleteReview(int no);
	void updateReview(Review review);
	List<Review> readReview();
	
	void createComment(Comment comment);
	void deleteComment(int no);
	void updateComment(Comment comment);
	
}
