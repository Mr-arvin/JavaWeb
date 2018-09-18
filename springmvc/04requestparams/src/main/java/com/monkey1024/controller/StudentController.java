package com.monkey1024.controller;

import com.monkey1024.bean.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 学生controller
 */

@Controller
@RequestMapping("/student")
public class StudentController {
    @RequestMapping("/add1")
    public ModelAndView add1(Student student) throws Exception{
        ModelAndView mv = new ModelAndView();
        mv.addObject("name",student.getName());
        mv.addObject("age",student.getAge());
        mv.setViewName("studentInfo");
        return mv;
    }

    @RequestMapping("/add2")
    public ModelAndView add2(Student student) throws Exception{
        ModelAndView mv = new ModelAndView();
        mv.addObject("name",student.getName());
        mv.addObject("age",student.getAge());
        mv.addObject("schoolName",student.getSchool().getSchoolName());
        mv.addObject("address",student.getSchool().getAddress());
        mv.setViewName("studentInfo");
        return mv;
    }
}
