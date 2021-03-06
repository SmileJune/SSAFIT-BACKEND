package com.ssafy.ssafit.model.dao;

import java.util.List;

import com.ssafy.ssafit.model.dto.Follow;
import com.ssafy.ssafit.model.dto.User;

public interface FollowDao {
	List<User> getFollower(String id);
	List<User> getFollowing(String id);
	void insertFollow(Follow follow);
	void deleteFollow(Follow follow);
}
