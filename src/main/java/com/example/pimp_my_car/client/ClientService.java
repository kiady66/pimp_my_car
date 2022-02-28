package com.example.pimp_my_car.client;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    public List<Client> getClient()
    {
        return List.of(
                new Client(
                        0,
                        "Kiady",
                        "Raveloson",
                        4
                )
        );
    }
}
