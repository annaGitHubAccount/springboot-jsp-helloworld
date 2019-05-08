package com.hellokoding.springboot.view.model.repository;

import com.hellokoding.springboot.view.model.entity.Wagen;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WagenRepository extends CrudRepository<Wagen, Long> {

    List<Wagen> findByMarke(String marke);
}
