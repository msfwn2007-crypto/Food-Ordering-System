 package com.foodsystem.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MenuDAO {

    private static final String URL =
            "jdbc:mysql://localhost:3306/food_ordering_system";
    private static final String USER = "root";
    private static final String PASSWORD = "safwan@7";

    public static boolean addFood(Menu food) {

        String sql =
        "INSERT INTO Menu(food_name, category, price, description, availability) VALUES(?,?,?,?,?)";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con =
                DriverManager.getConnection(URL, USER, PASSWORD);

            System.out.println("Database Connected Successfully!");

            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, food.getFoodName());
            pst.setString(2, food.getCategory());
            pst.setDouble(3, food.getPrice());
            pst.setString(4, food.getDescription());
            pst.setString(5, food.getAvailability());

            int rows = pst.executeUpdate();

            if (rows > 0) {
                System.out.println("Food Item Added Successfully!");
            }

            con.close();
            return true;

        } catch (Exception e) {
            System.out.println("Failed To Add Food Item");
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {

        Menu food = new Menu(
                "Shawarma",
                "Fast Food",
                140.00,
                "Chicken Shawarma Roll",
                "Available");

        addFood(food);
    }
}