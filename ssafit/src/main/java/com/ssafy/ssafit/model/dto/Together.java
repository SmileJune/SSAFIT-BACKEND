package com.ssafy.ssafit.model.dto;

public class Together {
	private String userId;
	private double lat;
	private double lng;
	private String content;
	private String date;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLng() {
		return lng;
	}
	public void setLng(double lng) {
		this.lng = lng;
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
	@Override
	public String toString() {
		return "Together [userId=" + userId + ", lat=" + lat + ", lng=" + lng + ", content=" + content + ", date="
				+ date + "]";
	}
	
	
	
}
