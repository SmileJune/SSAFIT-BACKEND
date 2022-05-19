package com.ssafy.ssafit.util;

import java.util.Base64;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JWTUtil {
	
	private static final String SALT = "SSAFIT";
	
	public static String getUserIdByToken(String token) {
		String str = new String(Base64.getDecoder().decode(token.split("\\.")[1]));
		return str.split("[\\\"]")[3];
	}
	
	public String  createToken(String claimId, String data) throws Exception{
		return Jwts.builder()
				.setHeaderParam("alg", "HS256")
				.setHeaderParam("typ", "JWT")
				.claim(claimId, data)
				.signWith(SignatureAlgorithm.HS256, SALT.getBytes("UTF-8"))
				.compact();
	}
	
	public void valid(String token) throws Exception {
		Jwts.parser()
		.setSigningKey(SALT.getBytes("UTF-8"))
		.parseClaimsJws(token);
	}
}
