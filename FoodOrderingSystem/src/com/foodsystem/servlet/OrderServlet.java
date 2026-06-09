package com.foodsystem.servlet;

public class OrderServlet {

    public void placeOrder(int orderId, double totalAmount) {

        System.out.println("Order Placed Successfully");
        System.out.println("Order ID: " + orderId);
        System.out.println("Total Amount: ₹" + totalAmount);
    }

    public static void main(String[] args) {

        OrderServlet order = new OrderServlet();

        order.placeOrder(101, 299.99);
    }
}
