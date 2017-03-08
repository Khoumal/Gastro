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
import modele.Client;

/**
 *
 * @author HKhoumal
 */
public class ClientDAO {
    public void SaveClient(Client cl) throws SQLException{
        String req="insert into client(IDSEXE,NOMCLIENT,DATENAISSANCE,ADRESSE) values (?,?,to_date(?,'dd-MM-yyyy'),?)";
        Connection c = null;
        try{
            c=new UtilDB().getConnectionPostgres();
            PreparedStatement ps = c.prepareStatement(req);
            ps.setInt(1,cl.getIdsexe());
            ps.setString(2,cl.getNomClient());
            ps.setString(3,cl.getDatenaissance().toString());
            ps.setString(4,cl.getAdresse());
            ps.executeQuery();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            c.close();
        }
    }
    
    public void UpdateClient(Client cl) throws SQLException{
        String req="update categorie set idsexe=?, nomclient=?, datenaissance=?, adresse=? where idclient=?";
        Connection c = null;
        try{
            c=new UtilDB().getConnectionPostgres();
            PreparedStatement ps = c.prepareStatement(req);
            ps.setInt(1,cl.getIdsexe());
            ps.setString(2,cl.getNomClient());
            ps.setString(3,cl.getDatenaissance().toString());
            ps.setString(4,cl.getAdresse());
            ps.setInt(5,cl.getIdCLient());
            ps.executeQuery();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            c.close();
        }
    }
    
    public void DeleteClient(Client cl) throws SQLException{
        String req="delete from client where idclient=?";
        Connection c = null;
        try{
            c=new UtilDB().getConnectionPostgres();
            PreparedStatement ps = c.prepareStatement(req);
            ps.setInt(1,cl.getIdCLient());
            ps.executeQuery();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            c.close();
        }
    }
    
    public ArrayList<Client> findAllClient() throws SQLException{
        ArrayList<Client> listeClient = new ArrayList<Client>(){};
         String req="select * from client";
        Connection c = null;
        try{
            c=new UtilDB().getConnectionPostgres();
            PreparedStatement ps = c.prepareStatement(req);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Client cl = new Client();
                    cl.setIdCLient(rs.getInt(1));
                    cl.setIdsexe(rs.getInt(2));
                    cl.setNomClient(rs.getString(3));
                    cl.setDatenaissance(rs.getDate(4));
                    cl.setAdresse(rs.getString(5));
                
                    
                listeClient.add(cl);

            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            c.close();
        }
        return listeClient;
    }
    
    public Client findClientById(int id) throws SQLException{
        Client c = new Client();
            ArrayList<Client> listeClient = new ClientDAO().findAllClient();
            for(int i=0;i<listeClient.size();i++){
                if(listeClient.get(i).getIdCLient()==id){
                    c=listeClient.get(i);
                }
            }
        return c;
    }
}
