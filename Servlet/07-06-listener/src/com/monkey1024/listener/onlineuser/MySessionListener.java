package com.monkey1024.listener.onlineuser;

import java.util.*;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * 监听session的销毁
 *
 */
@WebListener
public class MySessionListener implements HttpSessionListener {

   
	/**
     * 当session销毁时，将session从对应的List中移除
     * 判断List是否为空，如果为空，说明该ip已经离线，将其从map中删除
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
    		//获取当前被销毁的session
	    	HttpSession currentSession = se.getSession();
	    	//获取ServletContext对象
	    ServletContext sc = currentSession.getServletContext();
	    //从ServletContext中获取ipMap
	    Map<String,List<HttpSession>> ipMap = (Map<String, List<HttpSession>>) sc.getAttribute("ipMap");
	    
	    String ip = (String) currentSession.getAttribute("ip");
	    //根据ip去map中找到相应的list
	    List<HttpSession> sessionList = ipMap.get(ip);
	
	    //因为已经监听到currentSession被销毁，所以从sessionList中删除currentSession
	    sessionList.remove(currentSession);
	
	    //如果list的长度是0，则说明该ip所发出的session对象全部失效，可以将该ip从map中删除了
	    //如果list的长度不是0，则说明该ip所发出的session对象还存在，将变化写到map中
	    if(sessionList.size() == 0){
	        ipMap.remove(ip);
	    }else{
	        ipMap.put(ip, sessionList);
	    }
	
	    //将更新后的map放到ServletContext中
	    sc.setAttribute("ipMap", ipMap);
    }
	
}
