 package com.foodsystem.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CustomerDAO {

    private static final String URL =
            "jdbc:mysql://localhost:3306/food_ordering_system";
    private static final String USER = "root";
    private static final String PASSWORD = "safwan@7";

    public static boolean addCustomer(Customer customer) {

        String sql =
                "INSERT INTO customer(customerName, Phone, Address) VALUES(?,?,?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con =
                    DriverManager.getConnection(URL, USER, PASSWORD);

            System.out.println("Database Connected Successfully!");

            PreparedStatement pst = con.prepareStatement(sql);
            
            pst.setString(1, customer.getCustomerName());
            pst.setString(2, customer.getPhone());
            pst.setString(3, customer.getAddress());

            int rows = pst.executeUpdate();

            con.close();

            if (rows > 0) {
                System.out.println("Customer Added Successfully!");
                return true;
            }

        } catch (Exception e) {
            System.out.println("Failed To Add Customer");
            e.printStackTrace();
        }

        return false;
    }

    public static void main(String[] args) {

        Customer customer =
                new Customer("Safwan", "9876543210", "Kochi");

        addCustomer(customer);
    }
}

 