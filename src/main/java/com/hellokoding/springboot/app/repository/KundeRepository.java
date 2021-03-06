package com.hellokoding.springboot.app.repository;

import com.hellokoding.springboot.app.model.entity.Kunde;
import org.springframework.data.repository.CrudRepository;

// przy CrudRepository nie musze juz robic implementacji, wystarczy sam interfejs
// w Repository nazywam tylko odpowiednio metody i Spring sam wykonuje odpowiednie operacje w bazie danych na podstawie nazwy metody

// nie moge tu pisac metody np: void save(Kunde kunde); bo CrudRepository posiada juz taka metode. Jak to zrobie, to nie zaladuje sie spring context i dostane Exception
// tutaj zawieram tylko te metody, ktorych nie ma w CrudRepository.


public interface KundeRepository extends CrudRepository<Kunde, Long> {

    Kunde findKundeByNachname(String nachname);
}
