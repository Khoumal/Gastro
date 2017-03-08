/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import modele.Produit;
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
public class ProduitDAOTest {
    
    public ProduitDAOTest() {
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
     * Test of SaveProduit method, of class ProduitDAO.
     */
    @Test
    public void testSaveProduit() throws Exception {
        System.out.print("SaveProduit");
        Produit p = new Produit();
        p.setIdCategorie(5);
        p.setNomProduit("test");
        p.setImageProduit("test.jpg");
        ProduitDAO instance = new ProduitDAO();
        instance.SaveProduit(p);
        // TODO review the generated test code and remove the default call to fail.
       System.out.println(" ok");
    }

    /**
     * Test of UpdateProduit method, of class ProduitDAO.
     */
    @Test
    public void testUpdateProduit() throws Exception {
        System.out.print("UpdateProduit");
        Produit p = new Produit();
        p.setIdCategorie(5);
        p.setNomProduit("test");
        p.setImageProduit("test.jpg");
        ProduitDAO instance = new ProduitDAO();
        instance.UpdateProduit(p);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println(" ok");
    }

    /**
     * Test of DeleteProduit method, of class ProduitDAO.
     */
    @Test
    public void testDeleteProduit() throws Exception {
        System.out.print("DeleteProduit");
        Produit p = new Produit();
        p.setIdCategorie(5);
        p.setNomProduit("test");
        p.setImageProduit("test.jpg");
        ProduitDAO instance = new ProduitDAO();
        instance.DeleteProduit(p);
        // TODO review the generated test code and remove the default call to fail.
        System.out.println(" ok");
    }

    /**
     * Test of findAllProduit method, of class ProduitDAO.
     */
    @Test
    public void testFindAllProduit() throws Exception {
        System.out.print("findAllProduit");
        ProduitDAO instance = new ProduitDAO();
        ArrayList<Produit> expResult = new ArrayList<Produit>(){};
        Produit prod = new Produit();
        prod.setIdProduit(2);
        expResult.add(prod);
        ArrayList<Produit> result = instance.findAllProduit();
        assertEquals(expResult.get(0).getIdProduit(), result.get(0).getIdProduit());
        // TODO review the generated test code and remove the default call to fail.
        System.out.println(" ok");
    }

    /**
     * Test of findAllProduitById method, of class ProduitDAO.
     */
    @Test
    public void testFindProduitById() throws Exception {
        System.out.print("findAllProduitById");
        int id = 6;
        ProduitDAO instance = new ProduitDAO();
        Produit expResult = new Produit();
        expResult.setIdProduit(id);
       // expResult.setIdCategorie(5);
        Produit result = instance.findProduitById(id);
        assertEquals(expResult.getIdProduit(), result.getIdProduit());
        
        // TODO review the generated test code and remove the default call to fail.
        System.out.println(" ok");
    }
    
}
