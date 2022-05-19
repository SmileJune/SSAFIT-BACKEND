package com.ssafy.ssafit;

import com.ssafy.ssafit.util.JWTUtil;

public class Test {
	public static void main(String[] args) {
		System.out.println(JWTUtil.getUserIdByToken("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyLWlkIjoiZGxmd25zIn0.g5Z0oXVbtj-D7kXjqKlaVZef9MkvsZtwsc4AtQLgwiU"));
	}
}
