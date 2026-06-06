package com.foodsystem.servlet;

public class CartServlet {

    public void addToCart() {

        String itemName = "Burger";
        int quantity = 2;

        System.out.println("Item Added To Cart");
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
    }
}