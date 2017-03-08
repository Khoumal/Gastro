/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modele.Client;
import modele.Produit;

/**
 *
 * @author HKhoumal
 */
public class ProduitDAO {
    public void SaveProduit(Produit p) throws SQLException{
        String req="insert into produit(IDCATEGORIE,NOMPRODUIT,IMAGEPRODUIT) values (?,?,?)";
        Connection c = null;
        try{
            c=new UtilDB().getConnectionPostgres();
            PreparedStatement ps = c.prepareStatement(req);
            ps.setInt(1, p.getIdProduit());
            ps.setString(2,p.getNomProduit());
            ps.setString(3,p.getImageProduit());
            ps.executeQuery();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            c.close();
        }
    }
    
    
    public void UpdateProduit(Produit p) throws SQLException{
    String req="update produit set IDCATEGORIE=?, NOMPRODUIT=?,IMAGEPRODUIT=? where IDPRODUIT=?";
        Connection c = null;
        try{
            c=new UtilDB().getConnectionPostgres();
            PreparedStatement ps = c.prepareStatement(req);
            ps.setInt(1,p.getIdCategorie());
            ps.setString(2,p.getNomProduit());
            ps.setString(3,p.getImageProduit());
            ps.setInt(4, p.getIdProduit());
            ps.executeQuery();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            c.close();
        }
    }
    
    public void DeleteProduit(Produit p) throws SQLException{
         String req="delete from produit where idproduit=?";
        Connection c = null;
        try{
            c=new UtilDB().getConnectionPostgres();
            PreparedStatement ps = c.prepareStatement(req);
            ps.setInt(1,p.getIdProduit());
            ps.executeQuery();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            c.close();
        }
    }
    
    public ArrayList<Produit> findAllProduit() throws SQLException{
        ArrayList<Produit> listeProduit = new ArrayList<Produit>(){};
        String req="select * from produit";
        Connection c = null;
        try{
            c=new UtilDB().getConnectionPostgres();
            PreparedStatement ps = c.prepareStatement(req);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
               Produit p = new Produit();
               p.setIdProduit(rs.getInt(1));
               p.setIdCategorie(rs.getInt(2));
               p.setNomProduit(rs.getString(3));
               p.setImageProduit(rs.getString(4));
               
               listeProduit.add(p);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            c.close();
        }
        return listeProduit;
    }
    
    public Produit findProduitById(int id) throws SQLException{
        Produit p = new Produit();
        ArrayList<Produit> listeProduit= new ProduitDAO().findAllProduit();
        for(int i=0;i<listeProduit.size();i++){
            if(listeProduit.get(i).getIdProduit()==id){
                p=listeProduit.get(i);
            }
            
        }
        return p;
    }
}
