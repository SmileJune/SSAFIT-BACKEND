package com.ssafy.ssafit.model.dto;

import java.util.List;

public class Plan {
	private String userId;
	private List<Integer> videoList;
	private String date;
	private int videoNo;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public List<Integer> getVideoList() {
		return videoList;
	}
	public void setVideoList(List<Integer> videoList) {
		this.videoList = videoList;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getVideoNo() {
		return videoNo;
	}
	public void setVideoNo(int videoNo) {
		this.videoNo = videoNo;
	}
	@Override
	public String toString() {
		return "Plan [userId=" + userId + ", videoList=" + videoList + ", date=" + date + ", videoNo=" + videoNo + "]";
	}
	
	
	
}
