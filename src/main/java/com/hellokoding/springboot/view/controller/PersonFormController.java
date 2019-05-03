package com.hellokoding.springboot.view.controller;


import com.hellokoding.springboot.view.model.PersonForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Controller
@RequestMapping("/personForm")
public class PersonFormController {

    @GetMapping
    public String helloGoToPersonForm(Model model) {
        PersonForm personForm = new PersonForm();
        personForm.setName("Nixe");
        model.addAttribute("personForm", personForm);
        return "personForm";
    }


    @PostMapping
    public String personFormDatenAblesen(Model model, @ModelAttribute("personForm") PersonForm personForm) {

        model.addAttribute("name", personForm.getName());
        model.addAttribute("nachname", personForm.getNachname());

        String exMaedels = personForm.getExMaedels();
        if (exMaedels.equals("")) {
            model.addAttribute("exMaedels", new ArrayList<String>());
        } else {
            String[] exMaedelsArray = exMaedels.split(",");
            List<String> exMaedelsList = Arrays.asList(exMaedelsArray);
            model.addAttribute("exMaedels", exMaedelsList);
        }
        return "personConfirmation";
    }

}
