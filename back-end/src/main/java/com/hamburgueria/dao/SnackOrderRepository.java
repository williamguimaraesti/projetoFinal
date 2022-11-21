package com.hamburgueria.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hamburgueria.model.SnackOrderModel;

@Repository
public interface SnackOrderRepository extends JpaRepository<SnackOrderModel, Long>{

    com.hamburgueria.controller.SnackOrder save(com.hamburgueria.controller.SnackOrder snackOrder);

}