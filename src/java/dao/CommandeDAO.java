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
import modele.Commande;

/**
 *
 * @author HKhoumal
 */
public class CommandeDAO {
    public void SaveCommande(Commande cmd) throws SQLException{
         String req="insert into commande(IDCLIENT,NOMCOMMANDE,DESCRIPTIONCOM,DATECOMMANDE) values(?,?,?,to_date(?,'dd-MM-yyyy'))";
        Connection c = null;
        try{
            c=new UtilDB().getConnectionPostgres();
            PreparedStatement ps = c.prepareStatement(req);
            ps.setInt(1, cmd.getIdClient());
            ps.setString(2, cmd.getNomCommande());
            ps.setString(3, cmd.getDescCommande());
            ps.setString(4,cmd.getDateCom().toString());
            ps.executeQuery();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            c.close();
        }
    }
    
    public void UpdateCommande(Commande cmd) throws SQLException{
          String req="update commande set IDCLIENT=?, NOMCOMMANDE=?, DESCRIPTIONCOM=?, DATECOMMANDE=? where IDCOMMANDE=?";
        Connection c = null;
        try{
            c=new UtilDB().getConnectionPostgres();
            PreparedStatement ps = c.prepareStatement(req);
            ps.setInt(1,cmd.getIdClient());
            ps.setString(2,cmd.getNomCommande());
            ps.setString(3,cmd.getDescCommande());
            ps.setInt(4, cmd.getIdCommande());
            ps.executeQuery();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            c.close();
        }
    }
    
    public void DeleteCommande(Commande cmd) throws SQLException{
         String req="delete from commande where IDCOMMANDE=?";
        Connection c = null;
        try{
            c=new UtilDB().getConnectionPostgres();
            PreparedStatement ps = c.prepareStatement(req);
            ps.setInt(1,cmd.getIdCommande());
            ps.executeQuery();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            c.close();
        }
    }
    
    public ArrayList<Commande> findAllCommande() throws SQLException{
        ArrayList<Commande> listeCmd = new ArrayList<Commande>(){};
         String req="select * from commande";
        Connection c = null;
        try{
            c=new UtilDB().getConnectionPostgres();
            PreparedStatement ps = c.prepareStatement(req);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Commande cmd = new Commande();
                cmd.setIdCommande(rs.getInt(1));
                cmd.setIdClient(rs.getInt(2));
                cmd.setNomCommande(rs.getString(3));
                cmd.setDescCommande(rs.getString(4));
                cmd.setDateCom(rs.getDate(5));
                    
                listeCmd.add(cmd);

            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            c.close();
        }
        return listeCmd;
    }
    
    public Commande findCommandeById(int id) throws SQLException{
        Commande c = new Commande();
        ArrayList<Commande> listeCmd = new CommandeDAO().findAllCommande();
        for(int i=0;i<listeCmd.size();i++){
            if(listeCmd.get(i).getIdCommande()==id){
                c=listeCmd.get(i);
            }
        }
        
        return c;
    }
    
    public ArrayList<Commande> findCommandeByClient(Client cl) throws SQLException{
        ArrayList<Commande> UserCommande = new ArrayList<Commande>(){};
        ArrayList<Commande> AllCmd = new CommandeDAO().findAllCommande();
        
        for(int i=0;i<AllCmd.size();i++){
            if(AllCmd.get(i).getIdClient()==cl.getIdCLient()){
                UserCommande.add(AllCmd.get(i));
            }
        }
        return UserCommande;
    }
}
