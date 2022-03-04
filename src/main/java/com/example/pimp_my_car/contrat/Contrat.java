package com.example.pimp_my_car.contrat;

import javax.persistence.*;

@Entity
@Table
public class Contrat {

    @Id
    private Integer idContrat;

    private String nomContrat;

    private double margeContrat;

    public Contrat(Integer idContrat, String nomContrat, double margeContrat) {
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

    public double getMargeContrat() {
        return margeContrat;
    }
}
