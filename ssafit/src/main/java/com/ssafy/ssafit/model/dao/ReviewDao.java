package com.ssafy.ssafit.model.dao;

import java.util.List;

import com.ssafy.ssafit.model.dto.Comment;
import com.ssafy.ssafit.model.dto.Review;
import com.ssafy.ssafit.model.dto.Routine;

public interface ReviewDao {
	void insertReview(Review review);
	void insertRoutine(Routine routine);
	void deleteReview(int no);
	
	void updateReview(Review review);
	void updateRoutine(Routine routine);
	
	List<Review> selectReviews();
	List<Routine> selectRoutineByNo(int reviewNo);
	
	void insertComment(Comment comment);
}
