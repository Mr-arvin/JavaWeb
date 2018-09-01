package com.monkey1024.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller() //表示当前类是一个controller
public class TestController02 {

    @RequestMapping({"/test/hello.do","/test/world.do"})
    public ModelAndView test2(HttpServletRequest request, HttpServletResponse response) throws Exception{

        ModelAndView mv = new ModelAndView();
        mv.addObject("hello", "helloworld");
        mv.setViewName("test1");
        return mv;
    }
}
