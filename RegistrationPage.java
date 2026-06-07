/**
 * 
 */
package org.ictkerala.student;
import javax.swing.*;
import java.awt.*;

public class RegistrationPage extends JFrame {

    // Used by LoginPage
    public static String registeredEmail = "";
    public static String registeredPassword = "";

    private JTextField nameField;
    private JTextField emailField;
    private JPasswordField passwordField;
    private JPasswordField confirmPasswordField;

    public RegistrationPage() {

        setTitle("Food Ordering System - Registration");
        setSize(550, 550);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel titleLabel =
                new JLabel("USER REGISTRATION");

        titleLabel.setFont(
                new Font("Arial",
                        Font.BOLD,
                        22));

        titleLabel.setBounds(
                140, 20, 300, 30);

        JLabel nameLabel =
                new JLabel("Full Name:");

        nameLabel.setBounds(
                60, 90, 120, 25);

        nameField =
                new JTextField();

        nameField.setBounds(
                220, 90, 220, 30);

        JLabel emailLabel =
                new JLabel("Gmail:");

        emailLabel.setBounds(
                60, 150, 120, 25);

        emailField =
                new JTextField();

        emailField.setBounds(
                220, 150, 220, 30);

        JLabel passwordLabel =
                new JLabel("Password:");

        passwordLabel.setBounds(
                60, 210, 120, 25);

        passwordField =
                new JPasswordField();

        passwordField.setBounds(
                220, 210, 220, 30);

        JLabel confirmLabel =
                new JLabel("Confirm Password:");

        confirmLabel.setBounds(
                60, 270, 140, 25);

        confirmPasswordField =
                new JPasswordField();

        confirmPasswordField.setBounds(
                220, 270, 220, 30);

        JButton registerBtn =
                new JButton("Register");

        registerBtn.setBounds(
                120, 370, 120, 40);

        JButton backBtn =
                new JButton("Back to Login");

        backBtn.setBounds(
                270, 370, 140, 40);

        // Register Button
        registerBtn.addActionListener(e -> {

            String name =
                    nameField.getText().trim();

            String email =
                    emailField.getText().trim();

            String password =
                    new String(
                            passwordField.getPassword());

            String confirmPassword =
                    new String(
                            confirmPasswordField.getPassword());

            if (name.isEmpty()
                    || email.isEmpty()
                    || password.isEmpty()
                    || confirmPassword.isEmpty()) {

                JOptionPane.showMessageDialog(
                        this,
                        "Please fill all fields!");

                return;
            }

            if (!email.endsWith("@gmail.com")) {

                JOptionPane.showMessageDialog(
                        this,
                        "Please enter a valid Gmail address!");

                return;
            }

            if (!password.equals(confirmPassword)) {

                JOptionPane.showMessageDialog(
                        this,
                        "Passwords do not match!");

                return;
            }

            // Save credentials for LoginPage
            registeredEmail = email;
            registeredPassword = password;

            JOptionPane.showMessageDialog(
                    this,
                    "Registration Successful!");

            new LoginPage();

            dispose();
        });

        // Back Button
        backBtn.addActionListener(e -> {

            new LoginPage();

            dispose();
        });
        panel.add(titleLabel);
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(confirmLabel);
        panel.add(confirmPasswordField);
        panel.add(registerBtn);
        panel.add(backBtn);

        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new RegistrationPage();
        });
    }
}