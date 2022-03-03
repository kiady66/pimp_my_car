package com.example.pimp_my_car.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class ClientController {

    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @RequestMapping(path = "api/v1/client/authentication")
    public Map<String, String> authentication(@RequestBody Client client)
    {
        return clientService.authentication(client);
    }

    @RequestMapping(path = "api/v1/client")
    public List<Client> getClient()
    {
        return clientService.getClient();
    }
}
