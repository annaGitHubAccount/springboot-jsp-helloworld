package com.hellokoding.springboot.view.model;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JdbcPersonFormRepositoryTest {


    @Autowired
    private PersonFormRepository personFormRepository;

    @Test
    public void saveAndFindAllPersonsTest(){

        PersonDTO personDTO1 = new PersonDTO("Anna", "Polanska", "Pawel, Max");
        PersonDTO personDTO2 = new PersonDTO("Robert", "Polanski", "Basia, Gosia, Ala");
        PersonDTO personDTO3 = new PersonDTO("Adam", "Kowalski", "Zosia, Kasia");

        personFormRepository.saveDataToDatabase(personDTO1);
        personFormRepository.saveDataToDatabase(personDTO2);
        personFormRepository.saveDataToDatabase(personDTO3);

        List<PersonDTO> allPersons = personFormRepository.findAllPersons();
        Assert.assertEquals(3, allPersons.size());

        personFormRepository.deleteAllPersons();
        List<PersonDTO> allPersons2 = personFormRepository.findAllPersons();
        Assert.assertTrue(allPersons2.isEmpty());


    }




}
