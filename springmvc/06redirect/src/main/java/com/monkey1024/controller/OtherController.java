package com.monkey1024.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 被跳转的controller
 */
@Controller
public class OtherController {
    @RequestMapping("/other.do")
    public ModelAndView other() throws Exception {

        ModelAndView mv = new ModelAndView();
        mv.addObject("content","被跳转的controller");
        mv.setViewName("result");;
        return mv;  
    }
}
