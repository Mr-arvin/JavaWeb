package com.monkey1024.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 登陆
 */
@Controller
public class LoginController {
    @RequestMapping("/welcome.do")
    public ModelAndView welcome() throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.addObject("welcome","欢迎登陆本系统");
        mv.setViewName("welcome");
        return mv;
    }
}
