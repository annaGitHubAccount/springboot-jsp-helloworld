package com.hellokoding.springboot.app.service;

import com.hellokoding.springboot.app.model.entity.Kunde;


public interface KundeService {

    Kunde findKundeByNachname(String nachname);

    void save(Kunde kunde);


}
