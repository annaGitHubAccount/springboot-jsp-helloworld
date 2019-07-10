package com.hellokoding.springboot.app.model.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Kunde {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String nachname;

    // FetchType.EAGER - lista Wagen jest za kazdym razem pobierana w tranzakcji z bazy danych poprzez zapytanie SELECT w SQL. Te zapytanie jest bardzo duze.
    // FetchType.LAZY - lista Wagen jest tylko wtedy pobierana, gdy w tranzakcji wykonam na tej liscie jakas operacje (w KundeServiceImpl). Zapytanie jest male.
    @OneToMany(mappedBy = "kunde", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Wagen> wagenList;

    public Kunde() {
    }

    public Kunde(String name, String nachname, List<Wagen> wagenList) {
        this.name = name;
        this.nachname = nachname;
        this.wagenList = wagenList;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public List<Wagen> getWagenList() {
        return wagenList;
    }

    public void setWagenList(List<Wagen> wagenList) {
        this.wagenList = wagenList;
    }
}
