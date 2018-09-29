package com.monkey1024.listener.onlineuser;

import java.util.*;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 监听request的创建
 *
 */
@WebListener
public class MyRequestListener implements ServletRequestListener {

   
	/**
     * 
     */
    public void requestInitialized(ServletRequestEvent sre)  { 
	    	//获取请求对象
	    HttpServletRequest request = (HttpServletRequest) sre.getServletRequest();
	    //获取请求的ip
	    String ip = request.getRemoteAddr();
	    System.out.println(ip);
	    ServletContext sc = sre.getServletContext();
	    //从ServletContext中获取ipMap
	    Map<String,List<HttpSession>> ipMap = (Map<String, List<HttpSession>>) sc.getAttribute("ipMap");
	    //获取key为当前ip的list
	    List<HttpSession> list = ipMap.get(ip);
	    if(list == null){
	        list = new ArrayList<>();
	    }
	
	    //获取当前请求所关联的session
	    HttpSession currentSession = request.getSession();
	
	    //遍历该list，如果存在请求所关联的session对象，则说明这是同一个会话中的请求，无需处理。
	    for(HttpSession s : list){
	        if(s == currentSession){
	            return;
	        }
	    }
	
	    //当上面条件不满足时，说明是该ip创建的一个新的session对象，需要将该对象加入到list中
	    list.add(currentSession);
	    //将list添加到map中
	    ipMap.put(ip, list);
	    //将ipMap重新放到ServletContext域中
	    sc.setAttribute("ipMap", ipMap);
	
	    //将ip放到session中 //从currentSession中获取之前存放的ip，因为在session销毁时，需要IP地址，所以将IP地址放到session域中
	    currentSession.setAttribute("ip", ip);
    }
	
}
