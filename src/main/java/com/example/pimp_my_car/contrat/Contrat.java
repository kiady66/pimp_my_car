package com.example.pimp_my_car.contrat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contrat {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer idContrat;

    private String nomContrat;

    private Integer margeContrat;

    public Contrat(Integer idContrat, String nomContrat, Integer margeContrat) {
        this.idContrat = idContrat;
        this.nomContrat = nomContrat;
        this.margeContrat = margeContrat;
    }

    public Contrat() {
    }

    public void setIdContrat(Integer idContrat) {
        this.idContrat = idContrat;
    }

    public void setNomContrat(String nomContrat) {
        this.nomContrat = nomContrat;
    }

    public void setMargeContrat(Integer margeContrat) {
        this.margeContrat = margeContrat;
    }

    public Integer getIdContrat() {
        return idContrat;
    }

    public String getNomContrat() {
        return nomContrat;
    }

    public Integer getMargeContrat() {
        return margeContrat;
    }
}
