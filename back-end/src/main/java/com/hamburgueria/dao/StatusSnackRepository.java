package com.hamburgueria.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hamburgueria.model.StatusSnack;

@Repository
public interface StatusSnackRepository extends JpaRepository<StatusSnack, Long>{

    com.hamburgueria.controller.StatusSnack save(com.hamburgueria.controller.StatusSnack statusSnack);

}