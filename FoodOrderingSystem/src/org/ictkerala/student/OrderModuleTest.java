package org.ictkerala.student;

import java.util.ArrayList;
import java.util.List;

class Order {
	int orderId;
    String customerName;
    String itemName;
    int quantity;
    double totalAmount;

    public Order(int orderId, String customerName, String itemName,
                 int quantity, double totalAmount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.itemName = itemName;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
    }
}

public class OrderModuleTest {

    static List<Order> database = new ArrayList<>();

    // Place Order
    public static void placeOrder(Order order) {
        database.add(order);
        System.out.println("Order Placed Successfully!");
    }

    // Verify Order Stored
    public static boolean verifyOrder(int orderId) {
        for (Order order : database) {
            if (order.orderId == orderId) {
                return true;
            }
        }
        return false;
    }

    // Order Confirmation
    public static void displayConfirmation(Order order) {
        System.out.println("\n===== ORDER CONFIRMATION =====");
        System.out.println("Order ID      : " + order.orderId);
        System.out.println("Customer Name : " + order.customerName);
        System.out.println("Item Ordered  : " + order.itemName);
        System.out.println("Quantity      : " + order.quantity);
        System.out.println("Total Amount  : ₹" + order.totalAmount);
        System.out.println("Order Status  : Confirmed");
    }

    public static void main(String[] args) {

        Order order1 = new Order(
                101,
                "Safwan",
                "Burger",
                2,
                240.0
        );

        // Test Case 1: Place Order
        placeOrder(order1);

        // Test Case 2: Verify Order Stored
        if (verifyOrder(101)) {
            System.out.println("Order stored successfully in database.");
        } else {
            System.out.println("Order not found.");
        }

        // Test Case 3: Display Confirmation
        displayConfirmation(order1);
    }

}
