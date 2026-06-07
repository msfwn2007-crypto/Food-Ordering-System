package com.foodordering;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

    public class DBConnection {

    public static Connection getConnection() {
        Connection con = null;
        
        try {
            // Load the MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish the connection
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/foodorderingsystem", 
                "root", 
                "bhagi_2006@"
            );
            
            System.out.println("Database Connected Successfully");
            
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL Driver not found! Add the JAR to your Build Path.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed! Check your URL, username, or password.");
            e.printStackTrace();
        }
        
        return con;
    }
}
