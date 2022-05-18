package com.ssafy.ssafit.model.dao;

import com.ssafy.ssafit.model.dto.User;

public interface UserDao {
	User selectUserById(String id);
	User selectUser(User user);
	void insertUser(User user);
}
