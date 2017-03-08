/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.Date;

/**
 *
 * @author HKhoumal
 */
public class Commande {
    private int idCommande;
    private int idClient;
    private String NomCommande;
    private String DescCommande;
    private Date DateCom;

    /**
     * @return the idCommande
     */
    public int getIdCommande() {
        return idCommande;
    }

    /**
     * @param idCommande the idCommande to set
     */
    public void setIdCommande(int idCommande) {
        this.idCommande = idCommande;
    }

    /**
     * @return the idClient
     */
    public int getIdClient() {
        return idClient;
    }

    /**
     * @param idClient the idClient to set
     */
    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    /**
     * @return the NomCommande
     */
    public String getNomCommande() {
        return NomCommande;
    }

    /**
     * @param NomCommande the NomCommande to set
     */
    public void setNomCommande(String NomCommande) {
        this.NomCommande = NomCommande;
    }

    /**
     * @return the DescCommande
     */
    public String getDescCommande() {
        return DescCommande;
    }

    /**
     * @param DescCommande the DescCommande to set
     */
    public void setDescCommande(String DescCommande) {
        this.DescCommande = DescCommande;
    }

    /**
     * @return the DateCom
     */
    public Date getDateCom() {
        return DateCom;
    }

    /**
     * @param DateCom the DateCom to set
     */
    public void setDateCom(Date DateCom) {
        this.DateCom = DateCom;
    }
}
