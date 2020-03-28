package com.sooriya.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
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
    public ModelAndView submitForm(@ModelAttribute Student student) {

        ModelAndView modelAndView = new ModelAndView("SuccessPage");
        modelAndView.addObject("student",student);
        modelAndView.addObject("details",
                "Details :" + student.getStudentName() + "'s Hobby is :" + student.getStudentHobby());
        return  modelAndView;
    }
}
