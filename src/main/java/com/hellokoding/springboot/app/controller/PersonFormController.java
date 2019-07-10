package com.hellokoding.springboot.app.controller;


import com.hellokoding.springboot.app.model.PersonAssembler;
import com.hellokoding.springboot.app.model.dto.PersonDTO;
import com.hellokoding.springboot.app.model.PersonForm;
import com.hellokoding.springboot.app.repository.PersonFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private PersonFormRepository personFormRepository;

    PersonAssembler personAssembler = new PersonAssembler();


    @GetMapping
    public String helloGoToPersonForm(Model model) {
        PersonForm personForm = new PersonForm();
        personForm.setName("Nixe");
        model.addAttribute("personForm", personForm);
        return "personForm";
    }


    @PostMapping
    public String personFormDatenAblesen(Model model, @ModelAttribute("personForm") PersonForm personForm) {

        // model dziala na zasadzie mapy: spod klucza "name" z formularza "personForm.jsp" odczytuje jego wartosc
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

        PersonDTO personDTO = personAssembler.mapPersonFormNachDTO(personForm);
        personFormRepository.saveDataToDatabase(personDTO);

        return "personConfirmation";
    }

}
