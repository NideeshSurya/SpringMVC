package com.sooriya.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {

    @RequestMapping(value = "/admission.html", method = RequestMethod.GET)
    public ModelAndView getAdmissionForm() {
        ModelAndView modelAndView = new ModelAndView("admissionForm");
        return modelAndView;
    }

    @RequestMapping(value = "/submitForm.html", method = RequestMethod.POST)
    public ModelAndView submitForm(@ModelAttribute("studentObj") Student student, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {

            ModelAndView modelAndView = new ModelAndView("admissionForm");
            return  modelAndView;
        }

        ModelAndView modelAndView = new ModelAndView("SuccessPage");
        return  modelAndView;
    }

    @ModelAttribute
    public void setCommonObjects(Model model) {
        model.addAttribute("headerMessage", "Welcome to Spring MVC");
    }
}
