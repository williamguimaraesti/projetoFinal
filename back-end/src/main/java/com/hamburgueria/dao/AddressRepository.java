package com.hamburgueria.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hamburgueria.model.AddressModel;

@Repository
public interface AddressRepository extends JpaRepository<AddressModel, Long>{
    
}