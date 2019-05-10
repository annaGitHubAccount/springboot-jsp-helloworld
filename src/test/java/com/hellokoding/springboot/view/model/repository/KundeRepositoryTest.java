package com.hellokoding.springboot.view.model.repository;


import com.hellokoding.springboot.view.model.entity.Kunde;
import com.hellokoding.springboot.view.model.entity.Wagen;
import com.hellokoding.springboot.view.model.service.KundeService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KundeRepositoryTest {

    @Autowired
    private KundeService kundeService;


    @Test
    public void kundeRepositoryTest(){

        Wagen wagen1 = new Wagen("Audi", 2018);
        Wagen wagen2 = new Wagen("Opel", 1996);
        List<Wagen> wagenList1 = new ArrayList<>();
        wagenList1.add(wagen1);
        wagenList1.add(wagen2);

        Wagen wagen3 = new Wagen("VW", 2000);
        Wagen wagen4 = new Wagen("Audi", 2014);
        List<Wagen> wagenList2 = new ArrayList<>();
        wagenList2.add(wagen3);
        wagenList2.add(wagen4);


        Kunde kunde1 = new Kunde("Anna", "Polanska", wagenList1);
        Kunde kunde2 = new Kunde("Robert", "Kowalski", wagenList2);

        wagen1.setKunde(kunde1);
        wagen2.setKunde(kunde1);
        wagen3.setKunde(kunde2);
        wagen4.setKunde(kunde2);

        kundeService.save(kunde1);
        kundeService.save(kunde2);

        Kunde kunde = kundeService.findKundeByNachname("Kowalski");
        Assert.assertEquals("Kowalski", kunde.getNachname());


        List<Wagen> wagenList = kunde.getWagenList();

        Assert.assertEquals(2, wagenList.size());

    }
}
