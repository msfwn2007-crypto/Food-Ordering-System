package com.foodsystem.servlet;

public class LoginServlet {

    public void loginUser(String email, String password) {

        String storedEmail = "alia@gmail.com";
        String storedPassword = "password123";

        if (email.equals(storedEmail) &&
            password.equals(storedPassword)) {

            System.out.println("Login Successful");

        } else {

            System.out.println("Invalid Email or Password");
        }
    }

    public static void main(String[] args) {

        LoginServlet login = new LoginServlet();

        login.loginUser(
                "alia@gmail.com",
                "password123"
        );
    }
}
