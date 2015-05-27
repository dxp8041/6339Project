/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author deepak
 */
public class DatabaseManagement {
    // database connection settings
    private String dbURL = "jdbc:mysql://localhost:3306/admin";
    private String dbUser = "root";
    private String dbPass = "thelostlife123#E";
      
    

    public void connect(String keyword){
        Connection conn = null; // connection to the database
        String message = null;  // message will be sent back to client
         
        try {
            // connects to the database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conn = DriverManager.getConnection(dbURL, dbUser, dbPass);
 
            // constructs SQL statement
            String sql = "insert into domains (domain, deployed)  values(?,?);;";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, keyword);
            statement.setString(2, "1");
            
          
            statement.executeUpdate();
            
        } catch (SQLException ex) {
            message = "ERROR: " + ex.getMessage();
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                // closes the database connection
                try {
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        } 
                
    
}

    public String retrieve() {
        String message="";
        Connection conn = null; // connection to the database
         
        try {
            // connects to the database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conn = DriverManager.getConnection(dbURL, dbUser, dbPass);
 
            // constructs SQL statement
            String sql = "Select * From domains;";
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet rs=statement.executeQuery(sql);
            message+="<table border='1' style='width:100%'>";
            message+="<tr>";
                message+= "<td>ID</td>";
                message+=" <td>domain</td>";		
                message+="<td>Deployed</td>";
                message+="</tr>";
            while(rs.next()){
                
               
                message+="<tr>";
                message+= "<td>"+rs.getString("id")+"</td>";
                

                message+="<td><a href='http://"+rs.getString("domain")+"'>" +rs.getString("domain")+"</a></td>";		
                message+="<td>"+rs.getString("deployed")+"</td>";
                message+="</tr>";
  
               
                
            }
             message+="</table>";
          
          
        } catch (SQLException ex) {
            message = "ERROR: " + ex.getMessage();
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                // closes the database connection
                try {
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        } 
        
        
        return message;
        
    }
}
