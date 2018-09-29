package com.monkey1024.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 权限过滤器
 */
public class PermisionFilter implements Filter {

    
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//强转
		HttpServletRequest req= (HttpServletRequest)request;
		HttpServletResponse res = (HttpServletResponse)response;
		
		//获取请求路径
		String path = req.getServletPath();
		
		//判断请求路径是否包含/success
		if(path.startsWith("/success")) {
			HttpSession session = req.getSession();
			//如果session为null，则说明还未创建，跳转到登陆页面
			if(session == null) {
				res.sendRedirect(req.getContextPath()+"/login.jsp");
			}else {
				String user = (String) session.getAttribute("user");
				//如果user为null，则说明还未登陆成功，则跳转到登录界面
				if(user == null) {
					res.sendRedirect(req.getContextPath()+"/login.jsp");
				}
				//如果不为空，继续走，什么都不处理
			}
		}
		
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	

}
