package com.monkey1024.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * 返回Object类型
 */
@Controller
public class ReturnObjectController {
    @RequestMapping(value = "/returnString.do",produces = "text/html;charset=utf-8")
    @ResponseBody //告诉springmvc当前的returnString方法返回的数据添加到响应体里面（monkey1024）
    public Object returnString() throws Exception{

        return "小猴子monkey1024"; //因为@ResponseBody "monkey1024"会直接添加到响应体里面，而非根据这个字符串去找相应的monkey1024.jsp
    }

    @RequestMapping("/returnMap.do")
    @ResponseBody
    public Object returnMap() throws Exception{
        Map<String,String> map = new HashMap<>();
        map.put("hello","你好");
        map.put("world","世界");
        return map;
    }
}
