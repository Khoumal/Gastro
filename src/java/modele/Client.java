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
public class Client {
    private int idCLient;
    private int idsexe;
    private String NomClient;
    private Date datenaissance;
    private String adresse;

    public Client(){};
    /**
     * @return the idCLient
     */
    public int getIdCLient() {
        return idCLient;
    }

    /**
     * @param idCLient the idCLient to set
     */
    public void setIdCLient(int idCLient) {
        this.idCLient = idCLient;
    }

    /**
     * @return the idsexe
     */
    public int getIdsexe() {
        return idsexe;
    }

    /**
     * @param idsexe the idsexe to set
     */
    public void setIdsexe(int idsexe) {
        this.idsexe = idsexe;
    }

    /**
     * @return the NomClient
     */
    public String getNomClient() {
        return NomClient;
    }

    /**
     * @param NomClient the NomClient to set
     */
    public void setNomClient(String NomClient) {
        this.NomClient = NomClient;
    }

    /**
     * @return the datenaissance
     */
    public Date getDatenaissance() {
        return datenaissance;
    }

    /**
     * @param datenaissance the datenaissance to set
     */
    public void setDatenaissance(Date datenaissance) {
        this.datenaissance = datenaissance;
    }

    /**
     * @return the adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * @param adresse the adresse to set
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
