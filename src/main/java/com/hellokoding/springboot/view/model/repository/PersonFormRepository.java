package com.hellokoding.springboot.view.model.repository;

import com.hellokoding.springboot.view.model.PersonDTO;

import java.util.List;

public interface PersonFormRepository {

    void saveDataToDatabase(PersonDTO personDTO);

    List<PersonDTO> findAllPersons();

    List<PersonDTO> findPersonByName(String name);

    void deleteAllPersons();
}
