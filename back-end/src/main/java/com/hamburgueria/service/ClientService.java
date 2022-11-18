package com.hamburgueria.service;
import org.springframework.stereotype.Service;

import com.hamburgueria.dao.ClientRepository;

@Service
public class ClientService {
    
    final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }
}