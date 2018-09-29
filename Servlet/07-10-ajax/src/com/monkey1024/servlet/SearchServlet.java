package com.monkey1024.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 查询
 */
@WebServlet("/search")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		//获取ajax传入的用户输入的值
		String name = request.getParameter("name");
		
		//根据用户输入的值去查询数据库，这里省略数据库查询的操作，手写编写一个List结果集
		List<String> result = new ArrayList<>();
		result.add("m1");
		result.add("m2");
		result.add("m3");
		result.add("m4");
		
		System.out.println(result);
		
		//把集合中的数据转换为字符串返回到页面
		String str = "";
		//如果用户输入的内容是以m开头的话，则将数据返回
		if(name.startsWith("m")) {
			for(int i=0; i<result.size();i++) {
				if(i > 0) {
					str += ",";
				}
				str += result.get(i);
			}
		}
		System.out.println(str);
		
		//将数据响应到客户端
		response.getWriter().write(str);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
