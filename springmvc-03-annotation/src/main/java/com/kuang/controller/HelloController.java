package com.kuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/h1")
    public String sayHello(Model model){
        model.addAttribute("msg","hello,SpringMVC");
        return "hello";
    }
}
