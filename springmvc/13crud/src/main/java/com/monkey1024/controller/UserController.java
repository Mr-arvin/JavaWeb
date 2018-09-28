package com.monkey1024.controller;

import com.monkey1024.bean.User;
import com.monkey1024.util.DataUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;

/**
 * 实现简单的增删改查
 */
@Controller
public class UserController {

    /**
     * 查找所有用户
     * @return
     * @throws Exception
     */
    @RequestMapping("/findAll.do")
    public ModelAndView findAll() throws Exception {
        HashMap<String, User> allUser = DataUtil.findAll();
        ModelAndView mv = new ModelAndView();
        mv.addObject("allUser",allUser);
        mv.setViewName("user_list");
        return mv;
    }
}
