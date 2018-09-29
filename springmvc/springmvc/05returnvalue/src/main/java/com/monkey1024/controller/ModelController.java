package com.monkey1024.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * model接口，可以用来传递数据，模拟modelandview
 *
 */

@Controller
public class ModelController {
    //http://localhost:8086/modeldata.do?name=sadf
    @RequestMapping("/modeldata.do")
    public String modelData(Model model, String name) throws Exception {
        model.addAttribute("username",name);
        model.addAttribute(name);//类似于model.addAttribute("string",name);
        return "modeldata";
    }

    @RequestMapping("/modeldatalist.do")
    public String modelDataList(Model model) throws Exception {
        List<Integer> integersList = new ArrayList<>();
        integersList.add(1);
        integersList.add(5);
        integersList.add(3);
        model.addAttribute("username",integersList);
        return "modeldata";
    }
}
