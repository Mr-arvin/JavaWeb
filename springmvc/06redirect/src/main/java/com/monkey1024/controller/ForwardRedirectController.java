package com.monkey1024.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Spring mvc 中的转发和重定向
 */
@Controller
public class ForwardRedirectController {
    /**
     * 返回ModelAndView对象的转发
     * @return
     * @throws Exception
     */
    @RequestMapping("/forwardMAV.do")
    public ModelAndView forwardMAV()throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.addObject("type","返回ModelAndView对象的转发");
        //1：这里默认使用转发进行跳转
        //mv.setViewName("result");

        //2：手动显示的指定使用转发，此时视图解析器将会失效（当然没有必要这么写）
        mv.setViewName("forward:/jsp/result.jsp");
        return mv;
    }

    @RequestMapping("/otherforwardMAV.do")
    public ModelAndView fromOther()throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.addObject("type","返回ModelAndView对象的转发");
        //1：这里默认使用转发进行跳转
        //mv.setViewName("result");

        //2：转发 如果要跳转到其它controller上面，此时要forward
        mv.setViewName("forward:other.do");
        return mv;
    }
}
