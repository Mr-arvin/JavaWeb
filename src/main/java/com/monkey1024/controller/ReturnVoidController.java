package com.monkey1024.controller;

import com.monkey1024.bean.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 方法没有返回值
 * 使用原生servlet中的类（api）来实现跳转
 */
@Controller
public class ReturnVoidController {
    @RequestMapping("/servletjump1.do")
    public void servletJump1(HttpServletRequest request, HttpServletResponse response) throws Exception {
        request.getRequestDispatcher("/jsp/welcome.jsp").forward(request,response);
    }

    // http://localhost:8088/servletjump2.do?name=andy&age=28 模拟get请求，省的写表单了
    @RequestMapping("/servletjump2.do")
    public void servletJump2(HttpServletRequest request, HttpServletResponse response, Student student) throws Exception {
        request.setAttribute("student",student);
        request.getRequestDispatcher("/jsp/servletjump.jsp").forward(request,response);
    }
}
