package com.example.pimp_my_car.client;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ClientConfig {

    @Bean
    CommandLineRunner commandLineRunner(ClientRepository clientRepository) {
        return args -> {
            Client kiady = new Client(
                    "Kiady",
                    "Raveloson",
                    "ravelosonk@gmail.com",
                    "mdp",
                    0
            );

            Client simon = new Client(
                    "Simon",
                    "Chaval",
                    "simon@gmail.com",
                    "mdp",
                    1
            );

            Client thibaut = new Client(
                    "Thibault",
                    "Sawlterz",
                    "thibault@gmail.com",
                    "mdp",
                    2
            );

            Client coco = new Client(
                    "coco",
                    "colcol",
                    "coco@gmail.com",
                    "mdp",
                    3
            );

            clientRepository.saveAll(
                    List.of(kiady, simon, thibaut, coco)
            );

        };
    }

}
