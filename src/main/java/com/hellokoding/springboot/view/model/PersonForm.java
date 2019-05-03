package com.hellokoding.springboot.view.model;

public class PersonForm {

    private String name;
    private String nachname;
    private String exMaedels;

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

    public String getExMaedels() {
        return exMaedels;
    }

    public void setExMaedels(String exMaedels) {
        this.exMaedels = exMaedels;
    }
}
