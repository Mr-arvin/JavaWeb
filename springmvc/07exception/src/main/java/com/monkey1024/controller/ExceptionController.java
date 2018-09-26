package com.monkey1024.controller;

import com.monkey1024.myexception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 异常处理controller
 */
@Controller
public class ExceptionController {
    @RequestMapping("myException.do")
    public ModelAndView myException(String name) throws Exception {
        ModelAndView mv = new ModelAndView();
        if("jack".equals(name)){
            //http://localhost:8086/myException.do?name=jack
            throw new MyException("我的自定义异常"); //MyException会被springmvc.xml里面的对应标签所匹配到
        }
        if(!"jack".equals(name)){
            //http://localhost:8086/myException.do?name=andy
            throw new Exception("自带异常");
        }

        return mv;
    }
}
