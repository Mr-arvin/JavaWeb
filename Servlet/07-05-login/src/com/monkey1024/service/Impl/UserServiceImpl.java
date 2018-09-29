package com.monkey1024.service.Impl;

import com.monkey1024.dao.UserDao;
import com.monkey1024.dao.impl.UserDaoImpl;
import com.monkey1024.javabean.User;
import com.monkey1024.service.UserService;

public class UserServiceImpl implements UserService {

	//实例化UserDaoImpl类的拿到它对象
	UserDao userDao = new UserDaoImpl();
	
	@Override
	public void addUser(User user) throws Exception {
		userDao.addUser(user);
	}

	@Override
	public User findUserByNameAndPassword(User user) throws Exception {		
		return userDao.findUserByNameAndPassword(user);
	}

	@Override
	public User findUserByName(User user) throws Exception {
		// TODO Auto-generated method stub
		return userDao.findUserByName(user);
	}

}
