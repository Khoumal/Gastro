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
import modele.Menu;
import modele.Produit;

/**
 *
 * @author HKhoumal
 */
public class MenuDAO {
    public void SaveMenu(Menu menu) throws SQLException{
          String req="insert into menu(NOMMENU,DATECREATION) values (?,to_date(?,'dd-MM-yyyy'))";
        Connection c = null;
        try{
            c=new UtilDB().getConnectionPostgres();
            PreparedStatement ps = c.prepareStatement(req);
            ps.setString(1, menu.getNomMenu());
            ps.setString(2, menu.getDateCreationMenu().toString());
            ps.executeQuery();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            c.close();
        }
    }
    
    public void UpdateMenu(Menu menu) throws SQLException{
        String req="update menu set NOMMENU=?, DATECREATION=? where IDMENU=?";
        Connection c = null;
        try{
            c=new UtilDB().getConnectionPostgres();
            PreparedStatement ps = c.prepareStatement(req);
            ps.setString(1, menu.getNomMenu());
            ps.setInt(2,menu.getIdMenu());
           
            ps.executeQuery();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            c.close();
        }
    }
    
    public void DeleteMenu(Menu menu) throws SQLException{
          String req="delete from menu where idmenu=?";
        Connection c = null;
        try{
            c=new UtilDB().getConnectionPostgres();
            PreparedStatement ps = c.prepareStatement(req);
            ps.setInt(1,menu.getIdMenu());
            ps.executeQuery();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            c.close();
        }
    }
    
    public ArrayList<Menu> FindAllMenu() throws SQLException{
        ArrayList<Menu> listeMenu = new ArrayList<Menu>(){};
         String req="select * from menu";
        Connection c = null;
        try{
            c=new UtilDB().getConnectionPostgres();
            PreparedStatement ps = c.prepareStatement(req);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
               Menu m = new Menu();
               m.setIdMenu(rs.getInt(1));
               m.setNomMenu(rs.getString(2));
               m.setDateCreationMenu(rs.getDate(3));
               
               listeMenu.add(m);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            c.close();
        }
        return listeMenu;
    }
    
    public Menu FindMenuById(int id) throws SQLException{
        Menu menu = new Menu();
        ArrayList<Menu> listeMenu = new MenuDAO().FindAllMenu();
        for(int i=0;i<listeMenu.size();i++){
            if(listeMenu.get(i).getIdMenu()==id){
                menu=listeMenu.get(i);
            }
        }
        return menu;
    }
}
