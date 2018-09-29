package com.monkey1024.dao;

import com.monkey1024.javabean.User;

/**
 * 用户dao
 * @author xm
 *
 */
public interface UserDao {
	/**
	 * 
	 * 	user永久化
	 * 	user查找
	 * @throws Expection
	 */
	public void addUser(User user) throws Exception;
	/**
	 * 
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public User findUserByNameAndPassword (User user) throws Exception;
	/**
	 * 
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public User findUserByName(User user) throws Exception;
}
