package com.monkey1024.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class BugServlet implements Servlet {
	
	//注意：在servlet中不要定义可修改的成员变量，会有线程安全问题
	private int count; 

	public BugServlet() {
		System.out.println("调用无参构造方法");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("调用destroy方法");
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("调用init方法");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println(++count);
		System.out.println("调用service方法");
	}

}
