package com.monkey1024.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 方法中返回String类型
 * 如果你只希望方法执行完毕后跳转jsp或其它资源，此时可以使用String作为方法的返回值
 */
@Controller
public class ReturnStringController {
    /**
     * 跳转到内部资源
     * @return
     * @throws Exception
     */
    @RequestMapping("/welcome.do")
    public String welcome() throws Exception{
        return "welcome";
    }

    /**
     * 跳转到外部资源
     * @return
     * @throws Exception
     */
    @RequestMapping("/outer.do")
    public String monkey1024() throws Exception{

        //此处返回的字符串需要跟Springmvc.xml配置文件中的bean的id保持一致
        return "monkey1024";
    }
}
