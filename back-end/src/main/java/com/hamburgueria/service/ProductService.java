package com.hamburgueria.service;
import org.springframework.stereotype.Service;

import com.hamburgueria.dao.ProductRepository;

@Service
public class ProductService {

    final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}