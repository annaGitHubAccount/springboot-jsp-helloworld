package com.hellokoding.springboot.view.model.service;

import com.hellokoding.springboot.view.model.entity.Kunde;


public interface KundeService {

    Kunde findKundeByNachname(String nachname);

    void save(Kunde kunde);


}
