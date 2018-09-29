package com.monkey1024.dao.impl;

import com.monkey1024.dao.UserDao;
import com.monkey1024.javabean.User;
import com.monkey1024.util.DBUtil;
import java.sql.*;
import java.text.SimpleDateFormat;

public class UserDaoImpl implements UserDao {
	// 持久化 connection资源jdk7以后是自动关闭的
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	@Override
	public void addUser(User user) throws Exception {		
		
		conn = DBUtil.getConnection();		
		String sql = "insert into t_user(name,password,email,birthday) values(?,?,?,?)";
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String brithday = sdf.format(user.getBirthday());
		
		ps = conn.prepareStatement(sql);
		ps.setString(1, user.getName());
		ps.setString(2, user.getPassword());
		ps.setString(3, user.getEmail());
		ps.setString(4, brithday);
		
		//执行插入
		int flag = ps.executeUpdate ();
		if(flag > 0) {
			System.out.println ("插入成功");
		}else {
			System.out.println ("插入失败");
		}
		
	}

	@Override
	public User findUserByNameAndPassword(User user) throws Exception {
		conn = DBUtil.getConnection();
		String sql = ("select name,password,email,birthday from t_user where name=? and password=?");
		ps = conn.prepareStatement(sql);
		ps.setString(1, user.getName());
		ps.setString(2, user.getPassword());
		rs = ps.executeQuery ();
		//再准备把结果数据封装到User对象中
		User u = null;
		if(rs.next()) {
			u = new User();
			u.setName(rs.getString("name"));
			u.setPassword(rs.getString("password"));
			u.setEmail(rs.getString("email"));
			u.setBirthday(rs.getDate("birthday"));			
		}		
		return u;
	}

	@Override
	public User findUserByName(User user) throws Exception {
		conn = DBUtil.getConnection();
		String sql = ("select name,password,email,birthday from t_user where name=?");
		ps = conn.prepareStatement(sql);
		ps.setString(1, user.getName());
		rs = ps.executeQuery ();
		//再准备把结果数据封装到User对象中
		User u = null;
		if(rs.next()) {
			u = new User();
			u.setName(rs.getString("name"));
			u.setPassword(rs.getString("password"));
			u.setEmail(rs.getString("email"));
			u.setBirthday(rs.getDate("birthday"));			
		}		
		return u;
	}
	

}
