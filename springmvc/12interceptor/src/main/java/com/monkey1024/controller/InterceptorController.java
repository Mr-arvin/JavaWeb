package com.monkey1024.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InterceptorController {
    @RequestMapping("/test.do")
    public ModelAndView test() throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("result");
        return mv;
    }
}


//    @RequestMapping("/test.do")
//    public ModelAndView test() {
//        ModelAndView mv = new ModelAndView();
//
//        System.out.println("test方法");
//        mv.setViewName("result");
//
//        return mv;
//    }