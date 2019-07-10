package com.hellokoding.springboot.app.repository;

import com.hellokoding.springboot.app.model.entity.Wagen;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WagenRepository extends CrudRepository<Wagen, Long> {

    List<Wagen> findByMarke(String marke);
}
