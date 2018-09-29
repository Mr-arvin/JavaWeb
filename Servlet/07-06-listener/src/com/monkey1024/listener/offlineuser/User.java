package com.monkey1024.listener.offlineuser;

import java.util.*;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * 当与session发生绑定时，将用户名和产生的session对象放到map中
 *
 */
@WebListener
public class User implements HttpSessionBindingListener {

	private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        ServletContext sc = event.getSession().getServletContext();
        //获取ServletContext中的map
        Map<String,HttpSession> map = (Map<String, HttpSession>) sc.getAttribute("map");
        //将用户信息放到map中
        map.put(username, event.getSession());
    }
	
}
