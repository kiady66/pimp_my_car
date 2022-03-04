package com.example.pimp_my_car.contrat;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContratRepository extends JpaRepository<Contrat, Integer>{

    @Query("SELECT c FROM Contrat c WHERE c.idContrat = ?1")
    Optional<Contrat> findById(Integer id);
}