package com.ssafy.ssafit.model.dao;

import java.util.List;

import com.ssafy.ssafit.model.dto.Comment;
import com.ssafy.ssafit.model.dto.Review;
import com.ssafy.ssafit.model.dto.Routine;
import com.ssafy.ssafit.model.dto.Video;

public interface ReviewDao {
	void insertReview(Review review);
	void insertRoutine(Routine routine);
	void deleteReview(int no);
	
	void updateReview(Review review);
	void updateRoutine(Routine routine);
	
	List<Review> selectReviews();
	List<Routine> selectRoutineByNo(int reviewNo);
	List<Video> selectVideoByNo(int reviewNo);
	
	List<Comment> selectCommentByNo(int reviewNo);
	void insertComment(Comment comment);
	void deleteComment(int no);
	void updateComment(Comment comment);
	
	List<Review> selectFollowReviews(String id);
}
