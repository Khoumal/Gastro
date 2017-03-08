/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author HKhoumal
 */
public class Produit {
    private int idProduit;
    private int idCategorie;
    private String NomProduit;
    private String ImageProduit;
    private Categorie cat;
    
    public Produit(){};

    /**
     * @return the idProduit
     */
    public int getIdProduit() {
        return idProduit;
    }

    /**
     * @param idProduit the idProduit to set
     */
    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }

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
     * @return the NomProduit
     */
    public String getNomProduit() {
        return NomProduit;
    }

    /**
     * @param NomProduit the NomProduit to set
     */
    public void setNomProduit(String NomProduit) {
        this.NomProduit = NomProduit;
    }

    /**
     * @return the ImageProduit
     */
    public String getImageProduit() {
        return ImageProduit;
    }

    /**
     * @param ImageProduit the ImageProduit to set
     */
    public void setImageProduit(String ImageProduit) {
        this.ImageProduit = ImageProduit;
    }

    /**
     * @return the cat
     */
    public Categorie getCat() {
        return cat;
    }

    /**
     * @param cat the cat to set
     */
    public void setCat(Categorie cat) {
        this.cat = cat;
    }
}
