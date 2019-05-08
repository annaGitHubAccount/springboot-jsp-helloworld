package com.hellokoding.springboot.view.model;

public class PersonAssembler {

    public PersonDTO mapPersonFormNachDTO(PersonForm personForm){

        PersonDTO personDTO = new PersonDTO();

        String formName = personForm.getName();
        personDTO.setName(formName);

        String formNachname = personForm.getNachname();
        personDTO.setNachname(formNachname);

        String formExMaedels = personForm.getExMaedels();
        personDTO.setExMaedels(formExMaedels);

        return personDTO;
    }
}
