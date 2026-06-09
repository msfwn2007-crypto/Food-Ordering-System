package org.ictkerala.student;

import javax.swing.*;
import java.awt.*;

public class HomePage extends JFrame {

    private static final long serialVersionUID = 1L;

    public HomePage() {

        setTitle("Food Ordering System - Home");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel titleLabel = new JLabel("WELCOME TO FOOD ORDERING SYSTEM");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setBounds(80, 50, 450, 30);

        JButton menuBtn = new JButton("View Food Menu");
        menuBtn.setBounds(200, 140, 180, 40);

        JButton logoutBtn = new JButton("Logout");
        logoutBtn.setBounds(200, 210, 180, 40);

        menuBtn.addActionListener(e -> {
            new FoodMenuPage().setVisible(true);
            dispose();
        });

        logoutBtn.addActionListener(e -> {
            new LoginPage().setVisible(true);
            dispose();
        });

        panel.add(titleLabel);
        panel.add(menuBtn);
        panel.add(logoutBtn);

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new HomePage().setVisible(true);
        });
    }
}
