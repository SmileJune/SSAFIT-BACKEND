package com.ssafy.ssafit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.ssafit.model.dto.Comment;
import com.ssafy.ssafit.model.dto.Review;
import com.ssafy.ssafit.model.service.ReviewServiceImpl;
import com.ssafy.ssafit.util.JWTUtil;

@RestController
@RequestMapping("/api")
public class ApiReviewController {

	@Autowired
	private ReviewServiceImpl reviewService;

	@GetMapping("review")
	public List<Review> readReview() {
		return reviewService.readReview();
	}
//	@GetMapping("review/hot")
//	public void readReviewHot() { 
//		
//	}

	@PostMapping("review/write")
	public void writeReview(@RequestHeader("access-token") String token, @RequestBody Review review) {
		review.setUserId(JWTUtil.getUserIdByToken(token));
		reviewService.createReview(review);
	}

	@DeleteMapping("review/delete/{no}")
	public void deleteReview(@PathVariable int no) {
		reviewService.deleteReview(no);
	}

	@PutMapping("review/update")
	public void updateReview(@RequestBody Review review) {
		reviewService.updateReview(review);
	}
	
	
	@PostMapping("comment/write")
	public void writeComment(@RequestHeader("access-token") String token, @RequestBody Comment comment) {
		comment.setUserId(JWTUtil.getUserIdByToken(token));
		reviewService.createComment(comment);
	}
	
	@DeleteMapping("comment/delete/{no}")
	public void deleteComment(@PathVariable int no) {
		reviewService.deleteComment(no);
	}
	
	@PutMapping("comment/update")
	public void updateComment(@RequestBody Comment comment) {
		reviewService.updateComment(comment); 
	}
	
	@GetMapping("review/timeline")
	public List<Review> readTimeline(@RequestHeader("access-token") String token) {
		return reviewService.readTimeline(JWTUtil.getUserIdByToken(token));
	}
}
