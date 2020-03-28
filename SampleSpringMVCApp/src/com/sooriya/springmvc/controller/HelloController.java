package com.sooriya.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;


@Controller
public class HelloController {

    @RequestMapping("/welcome")
    protected ModelAndView helloWorld() {
        ModelAndView modelAndView = new ModelAndView("HelloPage");
        modelAndView.addObject("message","Hey you... Its working");
        return modelAndView;
    }
}
