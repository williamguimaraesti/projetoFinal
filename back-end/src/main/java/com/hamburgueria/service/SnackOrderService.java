package com.hamburgueria.service;
import org.springframework.stereotype.Service;

import com.hamburgueria.dao.SnackOrderRepository;

@Service
public class SnackOrderService {

    final SnackOrderRepository snackOrderRepository;

    public SnackOrderService(SnackOrderRepository snackOrderRepository) {
        this.snackOrderRepository = snackOrderRepository;
    }
}