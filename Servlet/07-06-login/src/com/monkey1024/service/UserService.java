package com.monkey1024.service;

import com.monkey1024.javabean.User;

public interface UserService {
	/**
	 * 添加用户信息
	 * @param user
	 * @throws Exception
	 */
	public void addUser(User user) throws Exception;
	
	public User findUserByNameAndPassword(User user) throws Exception;
	
	public User findUserByName(User user) throws Exception;
}
