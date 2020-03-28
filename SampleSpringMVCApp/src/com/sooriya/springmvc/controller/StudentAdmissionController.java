package com.sooriya.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {

    @RequestMapping(value = "/admission.html", method = RequestMethod.GET)
    public ModelAndView getAdmissionForm() {
        ModelAndView modelAndView = new ModelAndView("admissionForm");
        return modelAndView;
    }

    @RequestMapping(value = "/submitForm.html", method = RequestMethod.POST)
    public ModelAndView submitForm(@RequestParam(value = "studentName", defaultValue = "Mr. NA") String name,
                                   @RequestParam("studentHobby") String hobby) {

        ModelAndView modelAndView = new ModelAndView("SuccessPage");
        modelAndView.addObject("details", "Details :" + name + "'s Hobby is :" + hobby);
        return  modelAndView;
    }
}
