package com.sooriya.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/greet")
public class HelloController {

    @RequestMapping("/welcome")
    protected ModelAndView helloWorld1() {
        ModelAndView modelAndView = new ModelAndView("HelloPage");
        modelAndView.addObject("message","Hey you... Its working");
        return modelAndView;
    }

    @RequestMapping("/hello")
    protected ModelAndView helloWorld2() {
        ModelAndView modelAndView = new ModelAndView("HelloPage");
        modelAndView.addObject("message","Going good");
        return modelAndView;
    }
}
