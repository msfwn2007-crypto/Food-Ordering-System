package com.foodsystem.servlet;

public class OrderServlet {

    public void placeOrder() {

        int orderId = 101;
        double totalAmount = 299.99;

        System.out.println("Order Placed Successfully");
        System.out.println("Order ID: " + orderId);
        System.out.println("Total Amount: " + totalAmount);
    }
}