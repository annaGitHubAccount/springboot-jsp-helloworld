package com.hellokoding.springboot.view.model.repository;

import com.hellokoding.springboot.view.model.entity.Kunde;
import org.springframework.data.repository.CrudRepository;

public interface KundeRepository extends CrudRepository<Kunde, Long> {

    Kunde findKundeByNachname(String nachname);
}
