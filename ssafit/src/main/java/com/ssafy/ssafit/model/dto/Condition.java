package com.ssafy.ssafit.model.dto;

public class Condition {
	private int partNo;
	private int difficulty;
	private int spotNo;

	public int getPartNo() {
		return partNo;
	}

	public void setPartNo(int partNo) {
		this.partNo = partNo;
	}
	
	public int getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}

	public int getSpotNo() {
		return spotNo;
	}

	public void setSpotNo(int spotNo) {
		this.spotNo = spotNo;
	}

	@Override
	public String toString() {
		return "Condition [partNo=" + partNo + ", difficulty=" + difficulty + ", spotNo=" + spotNo + "]";
	}
	
	
	
}
