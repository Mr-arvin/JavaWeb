package com.monkey1024.javabean;

import java.util.*;

/**
 * 用户表（t_user）
 * @author xm
 *
 */
public class User {
	private int id;
	private String name;
	private String password;
	private String email;
	private Date birthday;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public User(int id, String name, String password, String email, Date birthday) {
		
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.birthday = birthday;
	}
	
	public User (){
		super();
	}
	
}
