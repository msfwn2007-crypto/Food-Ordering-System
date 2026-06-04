package org.ictkerala.student;

import java.util.HashMap;
import java.util.Map;

public class CartTest {
	static class Item {
        String name;
        double price;
        int quantity;

        Item(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }
    }

    static Map<String, Item> cart = new HashMap<>();

    // Add Item
    public static void addItem(String name, double price, int quantity) {
        cart.put(name, new Item(name, price, quantity));
        System.out.println(name + " added to cart.");
    }

    // Update Quantity
    public static void updateQuantity(String name, int quantity) {
        if (cart.containsKey(name)) {
            cart.get(name).quantity = quantity;
            System.out.println(name + " quantity updated to " + quantity);
        }
    }

    // Remove Item
    public static void removeItem(String name) {
        if (cart.containsKey(name)) {
            cart.remove(name);
            System.out.println(name + " removed from cart.");
        }
    }

    // Calculate Total
    public static double calculateTotal() {
        double total = 0;

        for (Item item : cart.values()) {
            total += item.price * item.quantity;
        }

        return total;
    }

    // Display Cart
    public static void displayCart() {
        System.out.println("\nCart Contents:");
        for (Item item : cart.values()) {
            System.out.println(item.name + " | Price: ₹" +
                    item.price + " | Qty: " + item.quantity);
        }
    }

    public static void main(String[] args) {

        // Test Case 1: Add Items
        addItem("Burger", 120, 2);
        addItem("Pizza", 250, 1);

        displayCart();

        // Test Case 2: Update Quantity
        updateQuantity("Burger", 3);

        displayCart();

        // Test Case 3: Remove Item
        removeItem("Pizza");

        displayCart();

        // Test Case 4: Verify Total Amount
        double total = calculateTotal();
        System.out.println("\nTotal Amount = ₹" + total);
    }

}
