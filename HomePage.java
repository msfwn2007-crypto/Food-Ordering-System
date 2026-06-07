/**
 * 
 */
package org.ictkerala.student;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HomePage extends JFrame {

    public HomePage() {

        setTitle("Food Ordering System - Home");
        setSize(900, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Main Panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        // Header
        JLabel titleLabel = new JLabel(
                "FOOD ORDERING SYSTEM",
                JLabel.CENTER);

        titleLabel.setFont(
                new Font("Arial",
                        Font.BOLD,
                        30));

        titleLabel.setBorder(
                BorderFactory.createEmptyBorder(
                        20, 0, 20, 0));

        // Welcome Message
        JLabel welcomeLabel = new JLabel(
                "<html><center>Welcome to Food Ordering System<br>"
                        + "Order your favorite food quickly and easily!</center></html>",
                JLabel.CENTER);

        welcomeLabel.setFont(
                new Font("Arial",
                        Font.PLAIN,
                        18));

        // Center Buttons Panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(
                new GridLayout(2, 2, 20, 20));

        buttonPanel.setBorder(
                BorderFactory.createEmptyBorder(
                        40, 100, 40, 100));

        JButton menuButton =
                new JButton("🍔 Food Menu");

        JButton cartButton =
                new JButton("🛒 Cart");

        JButton ordersButton =
                new JButton("📋 Orders");

        JButton logoutButton =
                new JButton("🚪 Logout");

        Font buttonFont =
                new Font("Arial",
                        Font.BOLD,
                        18);

        menuButton.setFont(buttonFont);
        cartButton.setFont(buttonFont);
        ordersButton.setFont(buttonFont);
        logoutButton.setFont(buttonFont);

        buttonPanel.add(menuButton);
        buttonPanel.add(cartButton);
        buttonPanel.add(ordersButton);
        buttonPanel.add(logoutButton);

        // Footer
        JLabel footerLabel =
                new JLabel(
                        "Enjoy Delicious Food!",
                        JLabel.CENTER);

        footerLabel.setFont(
                new Font("Arial",
                        Font.ITALIC,
                        16));

        // Button Actions

        menuButton.addActionListener(e -> {

            new FoodMenuPage(); // Opens Food Menu

            dispose();
        });

        cartButton.addActionListener(e -> {

            new CartPage(); // Opens Cart

        });

        ordersButton.addActionListener(e -> {

            JOptionPane.showMessageDialog(
                    this,
                    "Orders Page Coming Soon!"
            );
        });

        logoutButton.addActionListener(e -> {

            int choice =
                    JOptionPane.showConfirmDialog(
                            this,
                            "Are you sure you want to logout?",
                            "Logout",
                            JOptionPane.YES_NO_OPTION);

            if (choice ==
                    JOptionPane.YES_OPTION) {

                dispose();

                // new LoginPage();
            }
        });

        mainPanel.add(
                titleLabel,
                BorderLayout.NORTH);

        mainPanel.add(
                buttonPanel,
                BorderLayout.CENTER);

        mainPanel.add(
                footerLabel,
                BorderLayout.SOUTH);

        add(mainPanel);

        setVisible(true);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new HomePage();
        });
    }
}