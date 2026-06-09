package com.foodsystem.servlet;

public class CartServlet {

    public void addToCart(String itemName, int quantity) {

        if (itemName == null || itemName.trim().isEmpty()) {
            System.out.println("Error: Item name cannot be empty.");
            return;
        }

        if (quantity <= 0) {
            System.out.println("Error: Quantity must be greater than zero.");
            return;
        }

        System.out.println("Item Added To Cart Successfully");
        System.out.println("Item Name : " + itemName);
        System.out.println("Quantity  : " + quantity);
    }

    public static void main(String[] args) {

        CartServlet cart = new CartServlet();

        cart.addToCart("Burger", 2);
        cart.addToCart("Pizza", 1);
    }
}
