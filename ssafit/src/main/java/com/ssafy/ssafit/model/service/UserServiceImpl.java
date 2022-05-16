package com.ssafy.ssafit.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.ssafit.model.dao.UserDao;
import com.ssafy.ssafit.model.dto.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;

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

}
