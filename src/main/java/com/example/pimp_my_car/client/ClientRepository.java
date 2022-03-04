package com.example.pimp_my_car.client;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    @Query("SELECT c FROM Client c WHERE c.emailClient = ?1 AND c.mdpClient = ?2")
    Optional<Client> checkIdentification(String email, String mdp);

    @Query("SELECT c FROM Client c WHERE c.emailClient = ?1 AND c.accessToken = ?2")
    Optional<Client> checkAccessToken(String email, String accessToken);
}
