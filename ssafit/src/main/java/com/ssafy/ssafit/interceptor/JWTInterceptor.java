package com.ssafy.ssafit.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.ssafy.ssafit.exception.JWTTokenException;
import com.ssafy.ssafit.util.JWTUtil;

@Component
public class JWTInterceptor implements HandlerInterceptor {
	private static final String HEADER_AUTH = "access-token";

	@Autowired
	private JWTUtil jwtUtil;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		if (request.getMethod().equals("OPTIONS")) {
			return true;
		}

		// 사용자가 요청시 헤더에 보내준 토큰 가져오기
		final String token = request.getHeader(HEADER_AUTH);

		if (token != null) {
			jwtUtil.valid(token);
			return true;
		}
		throw new JWTTokenException();
	}
}
