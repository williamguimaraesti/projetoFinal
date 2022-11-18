package com.hamburgueria.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hamburgueria.model.SnackOrder;

@Repository
public interface SnackOrderRepository extends JpaRepository<SnackOrder, Long>{

    com.hamburgueria.controller.SnackOrder save(com.hamburgueria.controller.SnackOrder snackOrder);

}