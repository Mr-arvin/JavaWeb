package com.monkey1024.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class ParamsController01 {

    @RequestMapping("/params01")
    public ModelAndView getParams01(String username, int age) throws Exception {
        //方法的参数名需要跟前台页面中的表单里的input的name一致
        ModelAndView mv = new ModelAndView();
        mv.addObject("username",username);
        mv.addObject("age",age);
        mv.setViewName("getParamsResult");
        return mv;
    }
}
