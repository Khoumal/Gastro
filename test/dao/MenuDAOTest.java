/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import modele.Menu;
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
public class MenuDAOTest {
    
    public MenuDAOTest() {
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
     * Test of SaveMenu method, of class MenuDAO.
     */
    @Test
    public void testSaveMenu() throws Exception {
        System.out.println("SaveMenu");
        Menu menu = new Menu();
        MenuDAO instance = new MenuDAO();
        instance.SaveMenu(menu);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of UpdateMenu method, of class MenuDAO.
     */
    @Test
    public void testUpdateMenu() throws Exception {
        System.out.println("UpdateMenu");
        Menu menu = new Menu();
        MenuDAO instance = new MenuDAO();
        instance.UpdateMenu(menu);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of DeleteMenu method, of class MenuDAO.
     */
    @Test
    public void testDeleteMenu() throws Exception {
        System.out.println("DeleteMenu");
        Menu menu = new Menu();
        MenuDAO instance = new MenuDAO();
        instance.DeleteMenu(menu);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of FindAllMenu method, of class MenuDAO.
     */
    @Test
    public void testFindAllMenu() throws Exception {
        System.out.println("FindAllMenu");
        MenuDAO instance = new MenuDAO();
        ArrayList<Menu> expResult = new ArrayList<Menu>(){};
        Menu m = new Menu();
        m.setIdMenu(1);
        expResult.add(m);
        ArrayList<Menu> result = instance.FindAllMenu();
        assertEquals(expResult.get(0).getIdMenu(), result.get(0).getIdMenu());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of FindMenuById method, of class MenuDAO.
     */
    @Test
    public void testFindMenuById() throws Exception {
        System.out.println("FindMenuById");
        int id = 0;
        MenuDAO instance = new MenuDAO();
        Menu expResult = new Menu();
        expResult.setIdMenu(id);
        Menu result = instance.FindMenuById(id);
        assertEquals(expResult.getIdMenu(), result.getIdMenu());
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
