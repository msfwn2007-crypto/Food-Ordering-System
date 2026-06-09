 package com.foodsystem.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class UserDAO {

	private static final String URL =
		    "jdbc:mysql://localhost:3306/food_ordering_system";
    private static final String USER = "root";
    private static final String PASSWORD = "safwan@7";

    public static boolean addUser(User user) {

    	String sql =
    			"INSERT INTO Users(name, email, password, phone) VALUES(?,?,?,?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con =
                DriverManager.getConnection(URL, USER, PASSWORD);

            System.out.println("Database Connected Successfully!");

            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, user.getName());
            pst.setString(2, user.getEmail());
            pst.setString(3, user.getPassword());
            pst.setString(4, user.getPhone());

            int rows = pst.executeUpdate();
            System.out.println("Rows inserted = " + rows);

            con.close();

            if (rows > 0) {
                System.out.println("User Added Successfully!");
                return true;
            }

        } catch (Exception e) {
            System.out.println("Failed To Add User");
            e.printStackTrace();
        }

        return false;
    }
    

    public static void main(String[] args) {

    	User user = new User(
    		    "Test User",
    		    "test" + System.currentTimeMillis() + "@gmail.com",
    		    "password123",
    		    "9999999999");
    	

        addUser(user);
    }
}


