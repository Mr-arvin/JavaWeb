package com.monkey1024.listener.onlineuser;

import java.util.*;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;

/**
 * 监听servletContext的创建
 *
 */
@WebListener
public class MyServletContextListener implements ServletContextListener {

	/**
     * 当servletcontext创建的时候，初始化一个map,并放到servletcontext中
     */
    public void contextInitialized(ServletContextEvent sce)  { 
    		//map的key存放ip，value存放该ip地址生成的session对象的List集合
         Map<String,List<HttpSession>> ipMap = new HashMap<>();
         ServletContext servletContext = sce.getServletContext();
         //将创建好的map对象放到servletcontext域中
         servletContext.setAttribute("ipMap", ipMap);
    }
	
}
