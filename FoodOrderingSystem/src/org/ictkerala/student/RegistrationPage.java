package org.ictkerala.student;

import javax.swing.*;
import java.awt.*;

public class RegistrationPage extends JFrame {

    private static final long serialVersionUID = 1L;

    public static String registeredEmail = "";
    public static String registeredPassword = "";

    private JTextField nameField;
    private JTextField emailField;
    private JPasswordField passwordField;

    public RegistrationPage() {

        setTitle("Food Ordering System - Registration");
        setSize(500, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel titleLabel = new JLabel("USER REGISTRATION");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 22));
        titleLabel.setBounds(120, 30, 300, 30);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(60, 100, 100, 25);

        nameField = new JTextField();
        nameField.setBounds(180, 100, 220, 30);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(60, 150, 100, 25);

        emailField = new JTextField();
        emailField.setBounds(180, 150, 220, 30);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(60, 200, 100, 25);

        passwordField = new JPasswordField();
        passwordField.setBounds(180, 200, 220, 30);

        JButton registerBtn = new JButton("Register");
        registerBtn.setBounds(120, 300, 120, 40);

        JButton clearBtn = new JButton("Clear");
        clearBtn.setBounds(260, 300, 120, 40);

        registerBtn.addActionListener(e -> {

            String name = nameField.getText().trim();
            String email = emailField.getText().trim();
            String password = new String(passwordField.getPassword());

            if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {

                JOptionPane.showMessageDialog(
                        this,
                        "Please fill all fields!"
                );
                return;
            }

            registeredEmail = email;
            registeredPassword = password;

            JOptionPane.showMessageDialog(
                    this,
                    "Registration Successful!"
            );

            new LoginPage().setVisible(true);
            dispose();
        });

        clearBtn.addActionListener(e -> {
            nameField.setText("");
            emailField.setText("");
            passwordField.setText("");
        });

        panel.add(titleLabel);
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(registerBtn);
        panel.add(clearBtn);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new RegistrationPage();
        });
    }
}
