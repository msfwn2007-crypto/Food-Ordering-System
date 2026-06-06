package com.foodsystem.servlet;

public class RegisterServlet {

    public void registerUser() {

        String name = "Aliya";
        String email = "aliya@gmail.com";
        String phone = "9876543210";
        String password = "password123";

        System.out.println("User Registered Successfully");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
    }
}
