/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author nguye
 */
public class myconnection {
    public static Connection getconnect(){
      Connection connection=null;
     try{
         Class.forName("com.mysql.jdbc.Driver");
         System.out.println("JDBC Driver loaded successfully");
         
         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbquanlythuoc","root","");
         
         System.out.println("Connectes successfully to datavase");
     } catch(ClassNotFoundException e){
         System.out.println("SQL Server JDBC Driver not found: "+ e);        
     } catch(SQLException e){
         System.out.println("Connection failed: "+e.getMessage());
         e.printStackTrace();
     }
     return connection;
     
    }
}
