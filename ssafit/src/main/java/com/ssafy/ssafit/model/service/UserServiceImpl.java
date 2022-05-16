package com.ssafy.ssafit.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.ssafit.model.dao.FollowDao;
import com.ssafy.ssafit.model.dao.UserDao;
import com.ssafy.ssafit.model.dto.User;
import com.ssafy.ssafit.model.dto.Video;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;
	@Autowired
	private FollowDao followDao;

	@Override
	public User getUser(String id) {
		return userDao.selectUser(id); 
	}

	@Override
	public void insertJjim(User user) {
		userDao.insertJjim(user);
	}

	@Override
	public void deleteJjim(User user) {
		userDao.deleteJjim(user);
	}

	@Override
	public List<Video> listJjim(String id) {
		return userDao.listJjim(id);
	}

	@Override
	public List<User> getFollower(String id) {
		return followDao.getFollower(id);
	}

	@Override
	public List<User> getFollowing(String id) {
		return followDao.getFollowing(id);
	}

}
