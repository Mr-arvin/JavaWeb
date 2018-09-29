package methods;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ConfigTest01 implements Servlet {

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

	@Override // 每一个Servlet都有一个ServletConfig
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		this.config = arg0;

	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// 获取web.xml中配置的初始化参数
		String userName = config.getInitParameter("username");
		System.out.println(userName);

		// 获取当前servlet全部的初始化参数name
		Enumeration<String> pramas = config.getInitParameterNames();
		while (pramas.hasMoreElements()) {
			String name = pramas.nextElement();
			String value = config.getInitParameter(name);
			System.out.println(name + "," + value);
		}
		// 获取config的名字
		System.out.println("ServletName=" + config.getServletName());
	}

}
