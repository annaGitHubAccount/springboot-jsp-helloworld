package com.hellokoding.springboot.app.model.entity;


import javax.persistence.*;

@Entity
public class Wagen {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String marke;

    private Integer jahrgang;

    @ManyToOne
    private Kunde kunde;



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

    public Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }
}
