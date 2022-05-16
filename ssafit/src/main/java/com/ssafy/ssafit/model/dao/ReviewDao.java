package com.ssafy.ssafit.model.dao;

import java.util.List;

import com.ssafy.ssafit.model.dto.Review;

public interface ReviewDao {
	List<Review> selectReviewByVideoNo(int videoNo);
}
