package com.hellokoding.springboot.view.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JdbcPersonFormRepository implements PersonFormRepository {

    @Autowired
    private JdbcTemplate jdbc;

    @Override
    public void saveDataToDatabase(PersonDTO personDTO) {

        jdbc.update(
                "insert into Person (name, nachname, exMaedels) values (?, ?, ?)",
                personDTO.getName(), personDTO.getNachname(), personDTO.getExMaedels()
        );
    }

    @Override
    public List<PersonDTO> findAllPersons() {

        return jdbc.query("select name, nachname, exMaedels from Person",
                (result, row) ->
                        new PersonDTO(
                                result.getString("name"),
                                result.getString("nachname"),
                                result.getString("exMaedels")

                        )
        );
    }

    @Override
    public List<PersonDTO> findPersonByName(String name) {

        return jdbc.query("select name, nachname, exMaedels from Person where name=?",
                (result, row) ->
                        new PersonDTO(
                                result.getString("name"),
                                result.getString("nachname"),
                                result.getString("exMaedels")

                        ), name
        );

    }

    @Override
    public void deleteAllPersons() {

        jdbc.execute("delete from Person");
    }


}
