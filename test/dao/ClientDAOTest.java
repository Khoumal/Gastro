/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import modele.Client;
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
public class ClientDAOTest {
    
    public ClientDAOTest() {
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
     * Test of SaveClient method, of class ClientDAO.
     */
    @Test
    public void testSaveClient() throws Exception {
        System.out.println("SaveClient");
        Client cl = new Client();
        ClientDAO instance = new ClientDAO();
        instance.SaveClient(cl);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of UpdateClient method, of class ClientDAO.
     */
    @Test
    public void testUpdateClient() throws Exception {
        System.out.println("UpdateClient");
        Client cl = new Client();
        ClientDAO instance = new ClientDAO();
        instance.UpdateClient(cl);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of DeleteClient method, of class ClientDAO.
     */
    @Test
    public void testDeleteClient() throws Exception {
        System.out.println("DeleteClient");
        Client cl = new Client();
        ClientDAO instance = new ClientDAO();
        instance.DeleteClient(cl);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of findAllClient method, of class ClientDAO.
     */
    @Test
    public void testFindAllClient() throws Exception {
        System.out.println("findAllClient");
        ClientDAO instance = new ClientDAO();
        ArrayList<Client> expResult = new ArrayList<Client>(){};
        Client cust = new Client();
        cust.setIdCLient(10);
        expResult.add(cust);
        ArrayList<Client> result = instance.findAllClient();
        assertEquals(expResult.get(0).getIdCLient(), result.get(0).getIdCLient());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of findClientById method, of class ClientDAO.
     */
    @Test
    public void testFindClientById() throws Exception {
        System.out.println("findClientById");
        int id = 10;
        ClientDAO instance = new ClientDAO();
        Client expResult = new Client();
        expResult.setIdCLient(id);
        Client result = instance.findClientById(id);
        assertEquals(expResult.getIdCLient(), result.getIdCLient());
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
