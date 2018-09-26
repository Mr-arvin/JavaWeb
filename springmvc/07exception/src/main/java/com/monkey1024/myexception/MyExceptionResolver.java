package com.monkey1024.myexception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *自定义异常处理器
 */
public class MyExceptionResolver implements HandlerExceptionResolver {

    /**
     * 只要在程序中有异常抛出，那么就会执行该方法
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @return
     */
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("ex",ex);
        //是指默认异常处理界面
        mv.setViewName("error/error");
        if(ex instanceof MyException){
            //记录日志
            System.out.print("自定义");
            //设置异常跳转页面
            mv.setViewName("error/myerror");
        }else if(ex instanceof NullPointerException){
            //记录日志
        }
        return mv;
    }
}
