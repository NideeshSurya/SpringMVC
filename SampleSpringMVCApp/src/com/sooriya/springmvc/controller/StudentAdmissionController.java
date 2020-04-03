package com.sooriya.springmvc.controller;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class StudentAdmissionController {

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        /**
         * this will avoid data binding of mentioned field, passes no data for the field though provided.
          */

        //binder.setDisallowedFields(new String[] {"studentHobby"});

        /**
         * preparing a date pattern here, which in term allows the same pattern from user other wise throws exception.
         * There are several Property Editor classes provided by Spring MVC to customize data binding.
          */

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy**MM**dd");
        binder.registerCustomEditor(Date.class, "studentDOB", new CustomDateEditor(dateFormat,false));
        binder.registerCustomEditor(String.class,"studentName", new StudentNameEditor());
    }

    @RequestMapping(value = "/admission.html", method = RequestMethod.GET)
    public ModelAndView getAdmissionForm() {
        ModelAndView modelAndView = new ModelAndView("admissionForm");
        return modelAndView;
    }


    @RequestMapping(value = "/submitForm.html", method = RequestMethod.POST)
    public ModelAndView submitForm(@Valid @ModelAttribute("studentObj")  Student student, BindingResult bindingResult) {

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
