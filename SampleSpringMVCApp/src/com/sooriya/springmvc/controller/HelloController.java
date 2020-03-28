package com.sooriya.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;


@Controller
@RequestMapping("/greet")
public class HelloController {

    @RequestMapping("/welcome/{countryName}/{name}")
    protected ModelAndView helloWorld1(@PathVariable Map<String, String> pathVars) {

        String country = pathVars.get("countryName");
        String name = pathVars.get("name");
        ModelAndView modelAndView = new ModelAndView("HelloPage");
        modelAndView.addObject("message", "Hey " + name + ", You are from " + country);
        return modelAndView;
    }
}
