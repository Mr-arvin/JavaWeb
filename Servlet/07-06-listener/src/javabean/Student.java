package javabean;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * 监听session绑定javabean
 * 不需要在web.xml里注册
 */
@WebListener
public class Student implements HttpSessionBindingListener {
	private String name;
	private int age;
	

   public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	// 绑定的时候触发
	public void valueBound(HttpSessionBindingEvent event)  { 
         System.out.println("Student对象被添加到session中");
    }

	// 解绑的时候触发
    public void valueUnbound(HttpSessionBindingEvent event)  { 
    		System.out.println("Student对象到session中被移除");
    }
	
}
