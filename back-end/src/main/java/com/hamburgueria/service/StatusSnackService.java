package com.hamburgueria.service;
import org.springframework.stereotype.Service;

import com.hamburgueria.dao.StatusSnackRepository;

@Service
public class StatusSnackService {

    final StatusSnackRepository statusSnackRepository;

    public StatusSnackService(StatusSnackRepository statusSnackRepository) {
        this.statusSnackRepository = statusSnackRepository;
    }
}