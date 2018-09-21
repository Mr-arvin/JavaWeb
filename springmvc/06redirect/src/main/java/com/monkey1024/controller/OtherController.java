package com.monkey1024.controller;

import com.monkey1024.bean.School;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 被跳转的controller
 */
@Controller
public class OtherController {
    @RequestMapping("/other.do")
    public ModelAndView other(String type, School school) throws Exception {

        ModelAndView mv = new ModelAndView();
        mv.addObject("content","被跳转的controller 来自redirect_otherMAV");
        mv.addObject("type",type);
        mv.addObject("newschool",school);
        mv.addObject("school",school);
        mv.setViewName("result");;
        return mv;  
    }
}
