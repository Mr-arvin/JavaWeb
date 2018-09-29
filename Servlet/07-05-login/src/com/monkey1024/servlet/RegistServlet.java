package com.monkey1024.servlet;

import java.io.IOException;
import java.util.*;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.monkey1024.javabean.User;
import com.monkey1024.service.UserService;
import com.monkey1024.service.Impl.UserServiceImpl;

/**
 * Servlet implementation class RegistServlet
 */
public class RegistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		// 获取用户提交的表单数据，并封装到User中
		User u = new User();
		u.setName(request.getParameter("name"));
		u.setPassword(request.getParameter("password"));
		u.setEmail(request.getParameter("email"));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date brithday = (Date) sdf.parse(request.getParameter("birthday"));
			u.setBirthday(brithday);
		} catch (java.text.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 调用业务逻辑
		UserService us = new UserServiceImpl();		
		try {
			//判断用户名是否重复
			User result = us.findUserByName(u);
			//如果不能于null，则用户名重复
			if(result != null) {
				request.setAttribute("msg", "用户名重复");
				request.getRequestDispatcher("/regist.jsp").forward(request, response);
			}else {
				us.addUser(u);
				//我很好奇这里的u是个啥？答案是 封装的User所拥有的属性的数据的对象			
				// 分发转向
				response.getWriter().write("注册成功！1秒后跳转到主页");
				response.setHeader("refresh", "1;url=" + request.getContextPath() + "/loginn.jsp");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
