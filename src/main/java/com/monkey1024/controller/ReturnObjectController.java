package com.monkey1024.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 返回Object类型
 */
@Controller
public class ReturnObjectController {
    @RequestMapping("/returnString.do")
    @ResponseBody //告诉springmvc当前的returnString方法返回的数据添加到响应体里面（monkey1024）
    public Object returnString() throws Exception{

        return "monkey1024";
    }
}
