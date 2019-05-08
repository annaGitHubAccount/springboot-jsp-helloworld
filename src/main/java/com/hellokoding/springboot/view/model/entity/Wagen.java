package com.hellokoding.springboot.view.model.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Wagen {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String marke;

    private Integer jahrgang;


    public Wagen(String marke, Integer jahrgang) {
        this.marke = marke;
        this.jahrgang = jahrgang;
    }

    public Wagen(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public Integer getJahrgang() {
        return jahrgang;
    }

    public void setJahrgang(Integer jahrgang) {
        this.jahrgang = jahrgang;
    }
}
