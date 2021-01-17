package com.kuang.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RestFulController {

    @RequestMapping(value = "/commit/{p1}/{p2}",method = {RequestMethod.GET})
    public String index(@PathVariable int p1, @PathVariable int p2, Model model){
        int result=p1+p2;
        model.addAttribute("msg","结果为："+result);
        return "hello";

    }
}
