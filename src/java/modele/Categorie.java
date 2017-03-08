/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.List;

/**
 *
 * @author HKhoumal
 */
public class Categorie {
    private int idCategorie;
    private String NomCategorie;
    private List<Produit> listeProduit;

    /**
     * @return the idCategorie
     */
    public int getIdCategorie() {
        return idCategorie;
    }

    /**
     * @param idCategorie the idCategorie to set
     */
    public void setIdCategorie(int idCategorie) {
        this.idCategorie = idCategorie;
    }

    /**
     * @return the NomCategorie
     */
    public String getNomCategorie() {
        return NomCategorie;
    }

    /**
     * @param NomCategorie the NomCategorie to set
     */
    public void setNomCategorie(String NomCategorie) {
        this.NomCategorie = NomCategorie;
    }

    /**
     * @return the listeProduit
     */
    public List<Produit> getListeProduit() {
        return listeProduit;
    }

    /**
     * @param listeProduit the listeProduit to set
     */
    public void setListeProduit(List<Produit> listeProduit) {
        this.listeProduit = listeProduit;
    }
}
