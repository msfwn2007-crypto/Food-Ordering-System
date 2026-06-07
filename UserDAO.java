package com.foodordering;

import java.sql.Connection;
import java.sql.DriverManager;

public class UserDAO {

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/food_ordering_system",
                "root",
                ""
            );

            System.out.println("DB Connected Successfully");
            return con;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}