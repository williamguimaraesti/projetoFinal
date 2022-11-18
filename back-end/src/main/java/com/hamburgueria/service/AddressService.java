package com.hamburgueria.service;
import org.springframework.stereotype.Service;

import com.hamburgueria.dao.AddressRepository;

@Service
public class AddressService {

    final AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }
}