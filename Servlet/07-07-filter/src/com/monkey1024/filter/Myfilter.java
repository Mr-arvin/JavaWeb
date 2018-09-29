package com.monkey1024.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * 过滤器
 * @author xm
 *
 */

public class Myfilter implements Filter {
	
	public Myfilter() {
		System.out.println("实例化");
	}
	
	

	@Override
	public void destroy() {
		System.out.println("销毁");
	}



	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("初始化");
	}



	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		System.out.println("过滤请求");
		//通过过滤器继续访问资源
		arg2.doFilter(arg0, arg1);
		System.out.println("过滤响应");

	}

}
