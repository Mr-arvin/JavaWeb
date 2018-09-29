package com.monkey1024.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 手动设置Cookie的默认绑定路径
 */
public class CookieTest02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//创建Cookie对象,第一个参数类似map中的key，第二个类似map中的value，不要直接村中文，需要转码存
		Cookie cookie1 = new Cookie("username","admin");
		Cookie cookie2 = new Cookie("password","123456");
		//手动设置绑定路径
		cookie1.setPath(request.getContextPath() + "/aaa");
		cookie2.setPath(request.getContextPath() + "/aaa");
		//将cookie对象添加到响应中  /07-03-cs/test/123 所以cookie无法多个网站之间共享
		response.addCookie(cookie1);
		response.addCookie(cookie2);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
