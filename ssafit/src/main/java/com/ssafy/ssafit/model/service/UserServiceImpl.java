package com.ssafy.ssafit.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.ssafit.model.dao.FollowDao;
import com.ssafy.ssafit.model.dao.UserDao;
import com.ssafy.ssafit.model.dto.Follow;
import com.ssafy.ssafit.model.dto.User;
import com.ssafy.ssafit.model.dto.Video;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	@Autowired
	private FollowDao followDao;

	@Override
	public User getUser(String id) {
		return userDao.selectUserById(id);
	}

	@Override
	public boolean isUser(User user) {
		if (userDao.selectUser(user) == null) {
			return false;
		}
		return true;
	}

	@Override
	public void insertUser(User user) {
		userDao.insertUser(user);
	}

	@Override
	public List<User> getFollower(String id) {
		return followDao.getFollower(id);
	}

	@Override
	public List<User> getFollowing(String id) {
		return followDao.getFollowing(id);
	}

	@Override
	public void insertFollow(Follow follow) {
		followDao.insertFollow(follow);

	}

	@Override
	public void deleteFollow(Follow follow) {
		followDao.deleteFollow(follow);
	}

}
