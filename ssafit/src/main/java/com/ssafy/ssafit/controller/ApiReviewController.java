package com.ssafy.ssafit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.ssafit.model.dto.Review;
import com.ssafy.ssafit.model.service.ReviewServiceImpl;

@RestController
@RequestMapping("/api")
public class ApiReviewController {

	@Autowired
	private ReviewServiceImpl reviewService;

	@GetMapping("review/{videoNo}")
	public List<Review> reviewList(@PathVariable int videoNo) {
		return reviewService.getReviewListByVideoNo(videoNo);
	}
}
