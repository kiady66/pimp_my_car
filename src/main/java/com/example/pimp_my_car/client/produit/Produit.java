package com.example.pimp_my_car.client.produit;

public class Produit {

    private Integer idProduit;

    private String nomProduit;

    private Float prixProduit;

    public Produit(Integer idProduit, String nomProduit, Float prixProduit) {
        this.idProduit = idProduit;
        this.nomProduit = nomProduit;
        this.prixProduit = prixProduit;
    }

    public Produit() {}

    public Integer getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(Integer idProduit) {
        this.idProduit = idProduit;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public Float getPrixProduit() {
        return prixProduit;
    }

    public void setPrixProduit(Float prixProduit) {
        this.prixProduit = prixProduit;
    }
}
