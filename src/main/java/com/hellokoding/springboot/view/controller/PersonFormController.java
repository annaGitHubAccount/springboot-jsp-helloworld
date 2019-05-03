package com.hellokoding.springboot.view.controller;


import com.hellokoding.springboot.view.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/personForm")
public class PersonFormController {

    @GetMapping
    public String helloGoToPersonForm(Model model){
        model.addAttribute("person", new Person());
        return "personForm";
    }


    @PostMapping
    public String personFormDatenAblesen(Model model, @ModelAttribute("person") Person person) {
        model.addAttribute("person", person);
        return "personConfirmation";
    }

}
