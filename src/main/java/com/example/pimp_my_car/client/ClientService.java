package com.example.pimp_my_car.client;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

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

    public Map<String, String> authentication(Client client)
    {
        Optional<Client> clientCheck = clientRepository
                .checkIdentification(client.getEmailClient(), client.getMdpClient());

        HashMap<String, String> response = new HashMap<>();

        if (clientCheck.isPresent())
        {
            response.put("message", "connexion réussi");
            response.put("access-token", "test");
            return response;
        }

        response.put("message", "les identifiants saisis ne sont pas corrects");

        return response;
    }
}
