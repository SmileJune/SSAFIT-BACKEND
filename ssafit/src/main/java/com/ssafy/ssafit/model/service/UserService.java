package com.ssafy.ssafit.model.service;

import com.ssafy.ssafit.model.dto.User;

public interface UserService {
	User getUser(String id);
	void insertJjim(User user);
	void deleteJjim(User user);
}
