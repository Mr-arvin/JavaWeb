package com.monkey1024.listener.offlineuser;

import java.util.*;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;

/**
 * 监听ServletContext的初始化，初始化时创建一个map
 *
 */
@WebListener
public class MyServletContextListener implements ServletContextListener {

 
	/**
     * 初始化ServletContext
     */
    public void contextInitialized(ServletContextEvent sce)  { 
    		//map的key存放用户名，value存放该用户生成的session对象
        Map<String,HttpSession> map = new HashMap<>();
        ServletContext sc = sce.getServletContext();
        //将创建好的map对象放到ServletContext域中
        sc.setAttribute("map", map);
    }
	
}
