 package org.ictkerala.student; 

import java.util.Scanner;

public class MainApp {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n=== FOOD ORDERING SYSTEM ===");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. View Menu");
            System.out.println("4. Add to Cart");
            System.out.println("5. Place Order");
            System.out.println("6. Generate Invoice");
            System.out.println("0. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    register();
                    break;

                case 2:
                    login();
                    break;

                case 3:
                    viewMenu();
                    break;

                case 4:
                    addToCart();
                    break;

                case 5:
                    placeOrder();
                    break;

                case 6:
                    generateInvoice();
                    break;

                case 0:
                    System.out.println("Thank you for using Food Ordering System!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 0);

        sc.close();
    }

    // Register Module
    public static void register() {
        System.out.println("\n--- Registration Page ---");

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        System.out.println("Registration Successful!");
    }

    // Login Module
    public static void login() {
        System.out.println("\n--- Login Page ---");

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        System.out.println("Login Successful!");
    }

    // Menu Module
    public static void viewMenu() {
        System.out.println("\n--- Food Menu ---");
        System.out.println("1. Burger - ₹120");
        System.out.println("2. Pizza  - ₹250");
        System.out.println("3. Sandwich - ₹80");
        System.out.println("4. Juice - ₹50");
    }

    // Cart Module
    public static void addToCart() {
        System.out.println("\n--- Add To Cart ---");

        System.out.print("Enter Item Name: ");
        String item = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();
        sc.nextLine();

        System.out.println(item + " added to cart successfully.");
    }

    // Order Module
    public static void placeOrder() {
        System.out.println("\n--- Place Order ---");
        System.out.println("Order Placed Successfully!");
    }

    // Invoice Module
    public static void generateInvoice() {
        System.out.println("\n--- Invoice ---");
        System.out.println("Item      Quantity    Price");
        System.out.println("Burger       2        ₹240");
        System.out.println("--------------------------");
        System.out.println("Total Amount : ₹240");
    }
}