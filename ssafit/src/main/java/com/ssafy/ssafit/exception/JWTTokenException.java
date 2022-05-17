package com.ssafy.ssafit.exception;

public class JWTTokenException extends RuntimeException {
	public JWTTokenException() {
		super("토큰 문제 발생.");
	}
}
