package com.example.pimp_my_car.client;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer idClient;

    private String nomClient;

    private String prenomClient;

    private String emailClient;

    private String mdpClient;

    private Integer idContrat;

    public Client(){}

    public Client(Integer id, String nomClient, String prenomClient,
                  String emailClient, String mdpClient, Integer idContrat)
    {
        this.idClient = id;
        this.nomClient = nomClient;
        this.prenomClient = prenomClient;
        this.emailClient = emailClient;
        this.mdpClient = mdpClient;
        this.idContrat = idContrat;
    }

    public void setIdClient(Integer id) {
        this.idClient = id;
    }
    public Integer getIdClient() {
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
}
