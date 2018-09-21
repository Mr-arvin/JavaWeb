package com.monkey1024.controller;

import com.monkey1024.bean.School;
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

    //普通重定向
    @RequestMapping("/redirectMAV.do")
    public ModelAndView redirectMAV(School school) throws Exception {
        ModelAndView mv = new ModelAndView();
        //这里只能传递基本数据类型和String类型
        mv.addObject("type","返回ModelAndView对象的重定向");
        //测试如果传递对象则没效果
        //mv.addObject("school",new School());
        //重定向
        mv.setViewName("redirect:/jsp/result.jsp");
        return mv;
    }

    //controller跳转到controller
    @RequestMapping("/redirect_otherMAV.do")
    public ModelAndView redirec2tMAV() throws Exception {
        ModelAndView mv = new ModelAndView();
        //这里只能传递基本数据类型和String类型
        mv.addObject("type","返回ModelAndView对象的重定向 type");
        //只要名称和属性对应上，会自动帮你添加属性值，同时也会重定向到url参数中
        mv.addObject("schoolName","清华");
        mv.addObject("address","北京");
        //重定向
        mv.setViewName("redirect:other.do");
        return mv;
    }

    /**
     * 返回String类型的转发
     * http://localhost:8088/forwardStr.do?schoolName=清华
     * @param school
     * @return
     * @throws Exception
     */
    @RequestMapping("/forwardStr.do")
    //方法中的参数会被自动的放到Https request域中
    public String forwardStr(School school) throws Exception {
        //显示的指定使用转发
        return "forward:/jsp/result.jsp";
    }
}
