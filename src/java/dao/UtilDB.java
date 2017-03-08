/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author HKhoumal
 */
public class UtilDB {
    public Connection getConnectionPostgres() throws Exception {
           Class.forName("org.postgresql.Driver");
            Connection conn =  DriverManager.getConnection("jdbc:postgresql://localhost:5432/gastro","postgres", "root");
            return conn;

        }
}
