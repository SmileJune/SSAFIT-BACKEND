package com.ssafy.ssafit.exception;

public class PWIncorrectException extends RuntimeException{
	public PWIncorrectException() {
		super("비밀번호가 틀립니다.");
	}
}
