package org.ictkerala.student;

import java.util.Scanner;

public class FoodOrderingLogin {
	public static void main(String[] args) {

        String username = "safwan";
        String password = "1245";

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String user = sc.nextLine();

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        if(user.equals(username) && pass.equals(password)) {
            System.out.println("Login Successful!");
            System.out.println("Welcome to Food Ordering System");
        } else {
            System.out.println("Invalid Username or Password");
        }

        sc.close();
    }

}
