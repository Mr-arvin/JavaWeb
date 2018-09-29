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

    @RequestMapping("/findById.do")
    public ModelAndView findById(String id) throws Exception {
        ModelAndView mv = new ModelAndView();
        User user = DataUtil.findUserById(id);
        HashMap<String,User> allUser = new HashMap<>();
        allUser.put(id,user);
        mv.addObject("id",id);
        mv.addObject("allUser",allUser);
        mv.setViewName("user_list");
        return mv;
    }


    /**
     * 添加用户
     * @param user
     * @return
     * @throws Exception
     */
    @RequestMapping("/create.do")
    public String create(User user) throws Exception {
        DataUtil.create(user);
        return "redirect:findAll.do";
    }
}
