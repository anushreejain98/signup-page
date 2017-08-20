
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */

        
import java.sql.*;
import javax.swing.*;

public class javaconnect {
    Connection conn=null;
    
    public static Connection ConnecrDb()
    {
        try{
            Class.forName("org.sqlite.JDBC");
         
           Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Admin\\Documents\\NetBeansProjects\\pro123\\project123.sqlite");
           JOptionPane.showMessageDialog(null, "connection established");
            return conn;
          
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
    
}
