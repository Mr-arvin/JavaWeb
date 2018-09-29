package com.monkey1024.listener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class MyRequestListener implements ServletRequestListener {

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("request对象销毁");
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("request对象创建");
	}
	
}
