package com.hamburgueria.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hamburgueria.model.ProductModel;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, Long> {
    
}