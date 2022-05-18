package com.ssafy.ssafit.model.dto;

public class Routine {
	private int reviewNo;
	private int videoNo;
	private int difficulty;
	
	public int getReviewNo() {
		return reviewNo;
	}
	public void setReviewNo(int reviewNo) {
		this.reviewNo = reviewNo;
	}
	public int getVideoNo() {
		return videoNo;
	}
	public void setVideoNo(int videoNo) {
		this.videoNo = videoNo;
	}
	public int getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}
	@Override
	public String toString() {
		return "Routine [reviewNo=" + reviewNo + ", videoNo=" + videoNo + ", difficulty=" + difficulty + "]";
	}
	
	
}