package com.ssafy.ssafit.model.service;

import java.util.List;

import com.ssafy.ssafit.model.dto.Follow;
import com.ssafy.ssafit.model.dto.User;

public interface UserService {
	User getUser(String id);
	boolean isUser(User user);
	void insertUser(User user);
	List<User> getFollower(String id);
	List<User> getFollowing(String id);
	void insertFollow(Follow follow);
	void deleteFollow(Follow follow);
	
}
