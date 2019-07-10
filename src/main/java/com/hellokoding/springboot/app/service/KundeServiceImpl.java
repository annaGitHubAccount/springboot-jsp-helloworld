package com.hellokoding.springboot.app.service;

import com.hellokoding.springboot.app.model.entity.Kunde;
import com.hellokoding.springboot.app.repository.KundeRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

// warstwa tranzakcji. W jednej tranzakcji moge uzywac wiele Repositories.
// Service musi miec swoje metody, ktore moga sie nazywac tak jak w Repositorium.
// Tranzakcja przebiega w metodzie, zaznaczam ja jako: @Transactional

@Service
public class KundeServiceImpl implements KundeService{

    private final KundeRepository kundeRepository;

    // wstrzykuje poprzez Kostruktor. Moglabym tez przez @Autowired.
    public KundeServiceImpl(KundeRepository kundeRepository){
        this.kundeRepository = kundeRepository;
    }


    @Transactional
    public Kunde findKundeByNachname(String nachname) {
        return kundeRepository.findKundeByNachname(nachname);
    }

    @Transactional
    public void save(Kunde kunde){
        kundeRepository.save(kunde);
    }




}
