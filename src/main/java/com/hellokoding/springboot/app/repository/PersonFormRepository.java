package com.hellokoding.springboot.app.repository;

import com.hellokoding.springboot.app.model.dto.PersonDTO;

import java.util.List;

public interface PersonFormRepository {

    void saveDataToDatabase(PersonDTO personDTO);

    List<PersonDTO> findAllPersons();

    List<PersonDTO> findPersonByName(String name);

    void deleteAllPersons();
}
