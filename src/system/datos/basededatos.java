/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system.datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ivan
 */
public class basededatos {
    
    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;
    
    public basededatos(){
        try{
        Class.forName("org.postgresql.Driver");
        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/db-sistema", "postgres", "Ivan1524");
        
        st = conn.createStatement();
        
        
        
        }catch(ClassNotFoundException ex){
        ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    
    }
    public static void main(String[] args) {
        new basededatos();
    }
    
    
}
