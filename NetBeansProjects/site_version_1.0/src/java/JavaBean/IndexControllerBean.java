/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBean;

/**
 *
 * @author dpokhrel
 */
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import Databases.DatabaseManagement;
 
@WebServlet("/uploadServlet")
public class IndexControllerBean extends HttpServlet {
     
    
        
     
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        // getting values from an actor
        String email = request.getParameter("email");
        String keyword = request.getParameter("keyword");
        
        //removing all whitespaces
        keyword=keyword.replaceAll("\\s+","");
        keyword=keyword+".infinite-data.com";
        
       //2.Index Controller saves domain name 
        DatabaseManagement db=new DatabaseManagement();
        db.connect(keyword);
        
        //Once the controller gets successful message, then it creates a directory structure or war 
        //file under tomcat apache folder located in webapps or it could be in 
        //glashfish server
        
        //Glass fish server
        
        
        
        
        
         
         String message=db.retrieve();
        
       
            // sets the message in request scope
           request.setAttribute("Message", message);
             
             
            // forwards to the message page
            getServletContext().getRequestDispatcher("/Message.jsp").forward(request, response);
               
        }
    }

