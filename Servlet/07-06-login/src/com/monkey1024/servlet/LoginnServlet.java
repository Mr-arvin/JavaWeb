package com.monkey1024.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.monkey1024.javabean.User;
import com.monkey1024.service.UserService;
import com.monkey1024.service.Impl.UserServiceImpl;

/**
 * 登陆
 */
public class LoginnServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
         
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取用户提交的表单数据				
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		User user = new User();
		try {
			BeanUtils.populate(user, request.getParameterMap());
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		} catch (InvocationTargetException e1) {
			e1.printStackTrace();
		}
		//调用业务逻辑
		UserService us = new UserServiceImpl();
		try {
			User u = us.findUserByNameAndPassword(user);
			if(u != null) {
				//输入了正确的用户名和密码，跳转到登陆成功页面
				//将User数据放到session中，方便以后使用
				request.getSession().setAttribute("user", u);
				request.getRequestDispatcher("/loginn_success.jsp").forward(request,response);//转发
			}else {
				request.setAttribute("msg", "用户名或密码错误");
				request.getRequestDispatcher("/loginn.jsp").forward(request, response);;
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//根据是否登陆成功来做分发转向
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
