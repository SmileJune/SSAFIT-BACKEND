package com.ssafy.ssafit.model.dao;

import java.util.List;

import com.ssafy.ssafit.model.dto.MyData;
import com.ssafy.ssafit.model.dto.User;

public interface UserDao {
	User selectUserById(String id);
	User selectUser(User user);
	void insertUser(User user);
	void updateUser(User user);
	void deleteUser(String id);
	List<MyData> getMyData(String id);
}
