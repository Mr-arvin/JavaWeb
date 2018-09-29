package com.monkey1024.controller;

import com.monkey1024.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    //@Validated不能加在String类型或者基本数据类型的前面,user是个对象
    //BindingResult可以获取所有验证异常的信息
    @RequestMapping("/register.do")
    public ModelAndView register(@Validated User user, BindingResult br){
        ModelAndView mv = new ModelAndView();
        List<ObjectError> allErrors = br.getAllErrors();
        if(allErrors != null && allErrors.size() > 0) {
            FieldError nameError = br.getFieldError("name");
            FieldError ageError = br.getFieldError("age");
            FieldError phoneError = br.getFieldError("phone");
            //如果数据校验不通过，就进入下面的判断里
            if (nameError != null) {
                mv.addObject("nameError", nameError.getDefaultMessage());
            }
            if (ageError != null) {
                mv.addObject("ageError", ageError.getDefaultMessage());
            }
            if (phoneError != null) {
                mv.addObject("phoneError", phoneError.getDefaultMessage());
            }

            mv.setViewName("register");
            return mv;
        }
        mv.addObject("name",user.getName());
        mv.addObject("msg","注册成功!");
        mv.setViewName("user");
        return mv;
    }
}
