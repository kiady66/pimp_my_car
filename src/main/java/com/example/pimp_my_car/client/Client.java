package com.example.pimp_my_car.client;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.time.LocalDateTime;

@Component
@Entity
@Table
public class Client {

    @Id
    @SequenceGenerator(
            name = "client_sequence",
            sequenceName = "client_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "client_sequence"
    )
    private Long idClient;

    private String nomClient;

    private String prenomClient;

    private String emailClient;

    private String mdpClient;

    private Integer idContrat;

    private String accessToken;

    private LocalDateTime expirationDate;

    public Client(){}

    public Client(String nomClient, String prenomClient,
                  String emailClient, String mdpClient, Integer idContrat)
    {
        this.nomClient = nomClient;
        this.prenomClient = prenomClient;
        this.emailClient = emailClient;
        this.mdpClient = mdpClient;
        this.idContrat = idContrat;
    }

    public void setIdClient(Long id) {
        this.idClient = id;
    }
    public Long getIdClient() {
        return this.idClient;
    }

    public void setNomClient(String nomClient)
    {
        this.nomClient = nomClient;
    }

    public String getNomClient()
    {
        return this.nomClient;
    }

    public void setPrenomClient(String prenomClient)
    {
        this.prenomClient = prenomClient;
    }

    public String getPrenomClient()
    {
        return this.prenomClient;
    }

    public void setIdContrat(Integer idContrat)
    {
        this.idContrat = idContrat;
    }

    public Integer getIdContrat()
    {
        return this.idContrat;
    }

    public void setEmailClient(String emailClient)
    {
        this.emailClient = emailClient;
    }

    public String getEmailClient()
    {
        return this.emailClient;
    }

    public void setMdpClient(String mdpClient)
    {
        this.mdpClient = mdpClient;
    }

    public String getMdpClient()
    {
        return this.mdpClient;
    }
    public String getAccessToken()
    {
        return this.accessToken;
    }

    public void setAccessToken(String accessToken)
    {
        this.accessToken = accessToken;
    }

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }
}
