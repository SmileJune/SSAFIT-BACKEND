package com.ssafy.ssafit.model.dto;

public class Follow {
	
	private String from;
	private String to;
	
	public Follow() {
		super();
	}
	
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}

	@Override
	public String toString() {
		return "Follow [from=" + from + ", to=" + to + "]";
	}
	
	
}
