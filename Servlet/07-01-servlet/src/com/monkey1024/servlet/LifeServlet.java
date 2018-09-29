package com.monkey1024.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * 生命周期
 * @author xm
 *
 */

public class LifeServlet implements Servlet {
	
	public LifeServlet() {
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
		System.out.println("调用service方法");
	}

}
