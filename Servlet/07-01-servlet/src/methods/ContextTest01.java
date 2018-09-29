package methods;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ContextTest01 implements Servlet {
	
	private ServletConfig config;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

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
		this.config = arg0;

	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext application = this.config.getServletContext();
		
		System.out.println("Context01中的application" + application );
		
		//获取应用的初始化数据
	    String driver =	application.getInitParameter("MySqlDriver");
		System.out.println(driver);
		
		//获取路径
		String contextPath = application.getContextPath();
		System.out.println("contextPath:" + contextPath);
		
		//获取class文件在硬盘中的绝对路径
		String realPath = application.getRealPath("ConfigTest01"); 
		
		//想ServletContext中添加属性
		application.setAttribute("admin", "tiger");
		application.setAttribute("password",123456);
		//删除password
		application.removeAttribute("password");
	}

}
