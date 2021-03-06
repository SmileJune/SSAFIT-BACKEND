package com.ssafy.ssafit.model.dto;

import java.util.List;

public class Review {
	private int no;
	private String userId;
	private String title;
	private String content;
	private String date;
	private List<Video> videoList;
	private List<Routine> routineList;
	private List<Comment> commentList;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public List<Video> getVideoList() {
		return videoList;
	}
	public void setVideoList(List<Video> videoList) {
		this.videoList = videoList;
	}
	public List<Routine> getRoutineList() {
		return routineList;
	}
	public void setRoutineList(List<Routine> routineList) {
		this.routineList = routineList;
	}
	public List<Comment> getCommentList() {
		return commentList;
	}
	public void setCommentList(List<Comment> commentList) {
		this.commentList = commentList;
	}
	@Override
	public String toString() {
		return "Review [no=" + no + ", userId=" + userId + ", title=" + title + ", content=" + content + ", date="
				+ date + ", videoList=" + videoList + ", routineList=" + routineList + ", commentList=" + commentList
				+ "]";
	}
	
	
	
	
}