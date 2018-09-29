package javabean;

import java.io.Serializable;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;

/**
 * 监听对象的活化与钝化
 *
 */
@WebListener
public class Person implements HttpSessionActivationListener,Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 7076863370619947791L;
	
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

	//活化
	public void sessionDidActivate(HttpSessionEvent se)  { 
         System.out.println("活化：" + se.getSession().getId());
    }

	//钝化
    public void sessionWillPassivate(HttpSessionEvent se)  { 
    		System.out.println("钝化" + se.getSession().getId());
    }
	
}
