package com.hellokoding.springboot.view.model.repository;

import com.hellokoding.springboot.view.model.entity.Wagen;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WagenRepositoryTest {

    @Autowired
    private WagenRepository wagenRepository;


    @Test
    public void wagenRepoTesten(){


        Wagen wagen1 = new Wagen("Audi", 2018);
        Wagen wagen2 = new Wagen("Opel", 1996);
        Wagen wagen3 = new Wagen("VW", 2000);
        Wagen wagen4 = new Wagen("Audi", 2014);

        wagenRepository.save(wagen1);
        wagenRepository.save(wagen2);
        wagenRepository.save(wagen3);
        wagenRepository.save(wagen4);

        List<Wagen> audiList = wagenRepository.findByMarke("Audi");
        Assert.assertEquals(2, audiList.size());



    }
}
