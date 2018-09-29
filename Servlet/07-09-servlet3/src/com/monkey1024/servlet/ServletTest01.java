package com.monkey1024.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 使用注解来注册servlet
 */
//@WebServlet("/servlet02")
@WebServlet(
		value= {"/servlet01","/abc/servlet01"},
		name="servletname1",
		loadOnStartup=2,
		initParams= {
				@WebInitParam(name="teacher",value="monkkkey102224"),
				@WebInitParam(name="course",value="java")
		})
public class ServletTest01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletConfig servletConfig = this.getServletConfig();
		//获取servlet名称
		String servletname = servletConfig.getServletName();
		System.out.println(servletname);
		
		//获取初始化参数
		Enumeration<String> params = servletConfig.getInitParameterNames();
		while(params.hasMoreElements()) {
			String name = params.nextElement();
			String value = servletConfig.getInitParameter(name);
			System.out.println(name + ":" + value);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
