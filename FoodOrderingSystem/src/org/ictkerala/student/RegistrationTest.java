package org.ictkerala.student;

import java.util.HashSet;
import java.util.Set;

public class RegistrationTest {
	static Set<String> registeredEmails = new HashSet<>();

    public static String registerUser(String name, String email, String password) {

        // Check empty fields
        if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
            return "Registration Failed: Fields cannot be empty";
        }

        // Check duplicate email
        if (registeredEmails.contains(email)) {
            return "Registration Failed: Email already exists";
        }

        // Register user
        registeredEmails.add(email);
        return "Registration Successful";
    }

    public static void main(String[] args) {

        // Test Case 1: Successful Registration
        System.out.println("Test Case 1:");
        System.out.println(registerUser("Safwan", "safwan@gmail.com", "12345"));

        // Test Case 2: Empty Field Validation
        System.out.println("\nTest Case 2:");
        System.out.println(registerUser("", "test@gmail.com", "12345"));

        // Test Case 3: Duplicate Email
        System.out.println("\nTest Case 3:");
        System.out.println(registerUser("Safwan", "safwan@gmail.com", "67890"));
    }

}
