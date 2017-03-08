/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
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
public class UtilDBTest {
    
    public UtilDBTest() {
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
     * Test of getConnectionPostgres method, of class UtilDB.
     */
    @Test
    public void testGetConnectionPostgres() throws Exception {
        System.out.println("getConnectionPostgres");
        UtilDB instance = new UtilDB();
        Connection expResult = new UtilDB().getConnectionPostgres();
        Connection result = instance.getConnectionPostgres();
        assertEquals(expResult.getClass(), result.getClass());
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
