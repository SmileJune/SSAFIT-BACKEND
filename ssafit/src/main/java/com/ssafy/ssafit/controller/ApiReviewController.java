package com.ssafy.ssafit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.ssafit.model.dto.Review;
import com.ssafy.ssafit.model.service.ReviewServiceImpl;

@RestController
@RequestMapping("/api")
public class ApiReviewController {

	@Autowired
	private ReviewServiceImpl reviewService;

	@PostMapping("review/write")
	public void writeReview(@RequestBody Review review) {
		reviewService.createReview(review);
	}

	@DeleteMapping("review/delete/{no}")
	public void deleteReview(@PathVariable int no) {
		reviewService.deleteReview(no);
	}
}
