package com.ssafy.ssafit.model.dao;

import com.ssafy.ssafit.model.dto.User;

public interface UserDao {
	User selectUser(String id);
	void insertJjim(User user);
	void deleteJjim(User user);
}
