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
import modele.Categorie;

/**
 *
 * @author HKhoumal
 */
public class CategorieDAO {
 
    public void SaveCategorie(Categorie cat) throws SQLException{
        String req="insert into categorie(NOMCATEGORIE) values(?)";
        Connection c = null;
        try{
            c=new UtilDB().getConnectionPostgres();
            PreparedStatement ps = c.prepareStatement(req);
            ps.setString(1, cat.getNomCategorie());
            ps.executeQuery();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            c.close();
        }
        
        
    }
    
    
    public void UpdateCategorie(Categorie cat) throws SQLException{
         String req="update categorie set nomcategorie=? where idcategorie=?";
        Connection c = null;
        try{
            c=new UtilDB().getConnectionPostgres();
            PreparedStatement ps = c.prepareStatement(req);
            ps.setString(1, cat.getNomCategorie());
            ps.setInt(2, cat.getIdCategorie());
            ps.executeQuery();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            c.close();
        }
    }
    
    
    public void DeleteCategorie(Categorie cat) throws SQLException {
         String req="delete from categorie where idcategorie=?";
        Connection c = null;
        try{
            c=new UtilDB().getConnectionPostgres();
            PreparedStatement ps = c.prepareStatement(req);
            ps.setInt(1, cat.getIdCategorie());
            ps.executeQuery();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            c.close();
        }
    }
    
    public ArrayList<Categorie> findAllCategorie() throws SQLException{
        ArrayList<Categorie> listeCat = new ArrayList<Categorie>(){};
         String req="select * from categorie";
        Connection c = null;
        try{
            c=new UtilDB().getConnectionPostgres();
            PreparedStatement ps = c.prepareStatement(req);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Categorie categ = new Categorie();
                    categ.setIdCategorie(rs.getInt(1));
                    categ.setNomCategorie(rs.getString(2));
                    
                listeCat.add(categ);

            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            c.close();
        }
        return listeCat;
    }
    
    public Categorie findCatById(int id) throws SQLException{
        Categorie cat = new Categorie();
        ArrayList<Categorie> listeCat = new CategorieDAO().findAllCategorie();
        for(int i=0;i<listeCat.size();i++){
            if(listeCat.get(i).getIdCategorie()==id){
                cat=listeCat.get(i);
            }
        }
        return cat;
    }
}
