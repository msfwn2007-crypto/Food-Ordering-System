package com.foodsystem.servlet;

public class RegisterServlet {

    public void registerUser(String name,
                             String email,
                             String phone,
                             String password) {

        System.out.println("User Registered Successfully");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
    }

    public static void main(String[] args) {

        RegisterServlet register = new RegisterServlet();

        register.registerUser(
                "Aliya",
                "aliya@gmail.com",
                "9876543210",
                "password123"
        );
    }
}
