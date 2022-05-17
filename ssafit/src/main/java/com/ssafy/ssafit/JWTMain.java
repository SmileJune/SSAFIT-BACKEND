package com.ssafy.ssafit;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.Date;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JWTMain {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String token = 
				Jwts.builder()
					.setHeaderParam("alg", "HS256")
					.setHeaderParam("typ", "JWT")
					.claim("user-id", "ssafy")
					.setExpiration(new Date(System.currentTimeMillis()+ 1000*60*60*24*10))
					.signWith(SignatureAlgorithm.HS256, "SSAFIT".getBytes("UTF-8"))
					.compact();
		
		System.out.println(token);
		
		System.out.println(token.equals("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyLWlkIjoic3NhZnkifQ.Np71PIwW2_2Fj9-Ma52O46THlK3kQxu5nvyrE5hlNws"));
	
		
		
		
		Jws<Claims> claims = Jwts.parser()
								.setSigningKey("SSAFIT".getBytes("UTF-8"))
								.parseClaimsJws(token);
		System.out.println(claims);
		
		System.out.println(
				new String(
						Base64.getDecoder().decode(token.split("\\.")[1])
						)
				);
			
	}
}
