package com.ssafy.ssafit.model.dto;

public class MyData {
	
	private double difficulty;
	private int count;
	private int partNo;
	
	public double getDifficulty() {
		return difficulty;
	}
	public void setDifficulty(double difficulty) {
		this.difficulty = difficulty;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getPartNo() {
		return partNo;
	}
	public void setPartNo(int partNo) {
		this.partNo = partNo;
	}
	@Override
	public String toString() {
		return "MyData [difficulty=" + difficulty + ", count=" + count + ", partNo=" + partNo + "]";
	}
	
	
	
	
	
}
