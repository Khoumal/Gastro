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
public class Menu {
    private int idMenu;
    private String NomMenu;
    private Date dateCreationMenu;

    /**
     * @return the idMenu
     */
    public int getIdMenu() {
        return idMenu;
    }

    /**
     * @param idMenu the idMenu to set
     */
    public void setIdMenu(int idMenu) {
        this.idMenu = idMenu;
    }

    /**
     * @return the NomMenu
     */
    public String getNomMenu() {
        return NomMenu;
    }

    /**
     * @param NomMenu the NomMenu to set
     */
    public void setNomMenu(String NomMenu) {
        this.NomMenu = NomMenu;
    }

    /**
     * @return the dateCreationMenu
     */
    public Date getDateCreationMenu() {
        return dateCreationMenu;
    }

    /**
     * @param dateCreationMenu the dateCreationMenu to set
     */
    public void setDateCreationMenu(Date dateCreationMenu) {
        this.dateCreationMenu = dateCreationMenu;
    }
}
