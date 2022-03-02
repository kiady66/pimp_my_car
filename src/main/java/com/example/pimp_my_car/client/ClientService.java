package com.example.pimp_my_car.client;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> getClient()
    {
        return clientRepository.findAll();
    }
}
