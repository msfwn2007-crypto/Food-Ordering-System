/**
 * 
 */
/**
 * 
 */
package org.ictkerala.student;
import javax.swing.*;
import java.awt.*;

public class LoginPage extends JFrame {

    private JTextField emailField;
    private JPasswordField passwordField;

    public LoginPage() {

        setTitle("Food Ordering System - Login");
        setSize(500, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel titleLabel = new JLabel("FOOD ORDERING SYSTEM");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 22));
        titleLabel.setBounds(70, 30, 350, 30);

        JLabel emailLabel = new JLabel("Gmail:");
        emailLabel.setBounds(70, 100, 100, 25);

        emailField = new JTextField();
        emailField.setBounds(180, 100, 220, 30);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(70, 160, 100, 25);

        passwordField = new JPasswordField();
        passwordField.setBounds(180, 160, 220, 30);

        JButton loginBtn = new JButton("Login");
        loginBtn.setBounds(90, 250, 100, 35);

        JButton clearBtn = new JButton("Clear");
        clearBtn.setBounds(210, 250, 100, 35);

        JButton registerBtn = new JButton("Register");
        registerBtn.setBounds(330, 250, 100, 35);

        // Login Button
        loginBtn.addActionListener(e -> {

            String email = emailField.getText().trim();
            String password =
                    new String(passwordField.getPassword());

            if (email.isEmpty() || password.isEmpty()) {

                JOptionPane.showMessageDialog(
                        this,
                        "Please enter Gmail and Password!"
                );
                return;
            }

            if (email.equals(
                    RegistrationPage.registeredEmail)
                    &&
                    password.equals(
                    RegistrationPage.registeredPassword)) {

                JOptionPane.showMessageDialog(
                        this,
                        "Login Successful!"
                );

                new HomePage();

                dispose();

            } else {

                JOptionPane.showMessageDialog(
                        this,
                        "Invalid Gmail or Password!"
                );
            }
        });

        // Clear Button
        clearBtn.addActionListener(e -> {

            emailField.setText("");
            passwordField.setText("");
        });

        // Register Button
        registerBtn.addActionListener(e -> {

            new RegistrationPage();

            dispose();
        });

        panel.add(titleLabel);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginBtn);
        panel.add(clearBtn);
        panel.add(registerBtn);

        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new LoginPage();
        });
    }
}