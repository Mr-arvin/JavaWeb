package com.monkey1024.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.locale.converters.DateLocaleConverter;

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
		//使用apache commos-beanutil解决赋值操作
		try {			
			//因为User中的birthday是Date类型，所以需要先注册一个日期转换器
			ConvertUtils.register(new DateLocaleConverter(), Date.class);
			//User类中的属性名需要跟jsp表单中的name保持一致
			BeanUtils.populate(u, request.getParameterMap());
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InvocationTargetException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
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
