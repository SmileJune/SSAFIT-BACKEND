package com.ssafy.ssafit.model.dao;

import java.util.List;

import com.ssafy.ssafit.model.dto.User;
import com.ssafy.ssafit.model.dto.Video;

public interface UserDao {
	User selectUser(String id);
	void insertJjim(User user);
	void deleteJjim(User user);
	List<Video> listJjim(String id);
}
