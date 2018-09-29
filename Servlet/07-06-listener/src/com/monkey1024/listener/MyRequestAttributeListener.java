package com.monkey1024.listener;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * 监听request中属性变化
 *
 */
@WebListener
public class MyRequestAttributeListener implements ServletRequestAttributeListener {

    public void attributeRemoved(ServletRequestAttributeEvent srae)  { 
         System.out.println("从request中删除了一个属性" + srae.getName());
         System.out.println("属性名：" + srae.getName());
         System.out.println("属性值：" + srae.getValue());
    }

    public void attributeAdded(ServletRequestAttributeEvent srae)  { 
    		System.out.println("向request中添加了一个属性" + srae.getName());
        System.out.println("属性名：" + srae.getName());
        System.out.println("属性值：" + srae.getValue());
    }

    public void attributeReplaced(ServletRequestAttributeEvent srae)  {
    		System.out.println("修改了request中个属性" + srae.getName());
        System.out.println("属性名：" + srae.getName());
        System.out.println("属性值：" + srae.getValue());
  
    }
	
}
