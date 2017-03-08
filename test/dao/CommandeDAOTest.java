/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import modele.Client;
import modele.Commande;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HKhoumal
 */
public class CommandeDAOTest {
    
    public CommandeDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of SaveCommande method, of class CommandeDAO.
     */
    @Test
    public void testSaveCommande() throws Exception {
        System.out.println("SaveCommande");
        Commande cmd = new Commande();
        CommandeDAO instance = new CommandeDAO();
        instance.SaveCommande(cmd);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of UpdateCommande method, of class CommandeDAO.
     */
    @Test
    public void testUpdateCommande() throws Exception {
        System.out.println("UpdateCommande");
        Commande cmd = new Commande();
        CommandeDAO instance = new CommandeDAO();
        instance.UpdateCommande(cmd);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of DeleteCommande method, of class CommandeDAO.
     */
    @Test
    public void testDeleteCommande() throws Exception {
        System.out.println("DeleteCommande");
        Commande cmd = new Commande();
        CommandeDAO instance = new CommandeDAO();
        instance.DeleteCommande(cmd);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of findAllCommande method, of class CommandeDAO.
     */
    @Test
    public void testFindAllCommande() throws Exception {
        System.out.println("findAllCommande");
        CommandeDAO instance = new CommandeDAO();
        ArrayList<Commande> expResult = new ArrayList<Commande>(){};
        Commande cmd = new Commande();
        cmd.setIdCommande(1);
        ArrayList<Commande> result = instance.findAllCommande();
        assertEquals(expResult.get(0).getIdCommande(), result.get(0).getIdCommande());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of findCommandeById method, of class CommandeDAO.
     */
    @Test
    public void testFindCommandeById() throws Exception {
        System.out.println("findCommandeById");
        int id = 0;
        CommandeDAO instance = new CommandeDAO();
        Commande expResult = new Commande();
        Commande result = instance.findCommandeById(id);
        assertEquals(expResult.getIdCommande(), result.getIdCommande());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of findCommandeByClient method, of class CommandeDAO.
     */
    @Test
    public void testFindCommandeByClient() throws Exception {
        System.out.println("findCommandeByClient");
        Client cl = new Client();
        cl.setIdCLient(1);
        CommandeDAO instance = new CommandeDAO();
        ArrayList<Commande> expResult = new ArrayList<Commande>(){};
        ArrayList<Commande> result = instance.findCommandeByClient(cl);
        assertEquals(expResult.get(0).getIdClient(), result.get(0).getIdClient());
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
