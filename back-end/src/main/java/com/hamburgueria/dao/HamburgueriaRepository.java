package com.hamburgueria.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hamburgueria.model.Burger;

@Repository
public interface HamburgueriaRepository extends JpaRepository<Burger, Long>{

}
