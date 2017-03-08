/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import modele.Categorie;
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
public class CategorieDAOTest {
    
    public CategorieDAOTest() {
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
     * Test of SaveCategorie method, of class CategorieDAO.
     */
    @Test
    public void testSaveCategorie() throws Exception {
        System.out.println("SaveCategorie");
        Categorie cat = new Categorie();
        CategorieDAO instance = new CategorieDAO();
        instance.SaveCategorie(cat);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of UpdateCategorie method, of class CategorieDAO.
     */
    @Test
    public void testUpdateCategorie() throws Exception {
        System.out.println("UpdateCategorie");
        Categorie cat = new Categorie();
        CategorieDAO instance = new CategorieDAO();
        instance.UpdateCategorie(cat);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of DeleteCategorie method, of class CategorieDAO.
     */
    @Test
    public void testDeleteCategorie() throws Exception {
        System.out.println("DeleteCategorie");
        Categorie cat = new Categorie();
        CategorieDAO instance = new CategorieDAO();
        instance.DeleteCategorie(cat);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of findAllCategorie method, of class CategorieDAO.
     */
    @Test
    public void testFindAllCategorie() throws Exception {
        System.out.println("findAllCategorie");
        CategorieDAO instance = new CategorieDAO();
        ArrayList<Categorie> expResult = new ArrayList<Categorie>(){};
        Categorie ct = new Categorie();
        ct.setIdCategorie(5);
        expResult.add(ct);
        ArrayList<Categorie> result = instance.findAllCategorie();
        assertEquals(expResult.get(0).getIdCategorie(), result.get(0).getIdCategorie());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of findCatById method, of class CategorieDAO.
     */
    @Test
    public void testFindCatById() throws Exception {
        System.out.println("findCatById");
        int id = 8;
        CategorieDAO instance = new CategorieDAO();
        Categorie expResult = new Categorie();
        expResult.setIdCategorie(id);
        Categorie result = instance.findCatById(id);
        assertEquals(expResult.getIdCategorie(), result.getIdCategorie());
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
