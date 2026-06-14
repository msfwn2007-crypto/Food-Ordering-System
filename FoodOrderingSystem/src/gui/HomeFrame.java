package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HomeFrame extends JFrame implements ActionListener {

    JLabel titleLabel;
    JButton menuButton, cartButton, checkoutButton, logoutButton;

    public HomeFrame() {

        setTitle("Food Ordering System - Home");
        setSize(500, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(255, 228, 181)); // Light orange
        

        titleLabel = new JLabel("WELCOME TO FOOD ORDERING SYSTEM");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setBounds(50, 40, 400, 30);
        add(titleLabel);

        menuButton = new JButton("View Menu");
        menuButton.setBounds(150, 100, 180, 40);
        menuButton.addActionListener(this);
        add(menuButton);

        cartButton = new JButton("View Cart");
        cartButton.setBounds(150, 160, 180, 40);
        cartButton.addActionListener(this);
        add(cartButton);

        checkoutButton = new JButton("Checkout");
        checkoutButton.setBounds(150, 220, 180, 40);
        checkoutButton.addActionListener(this);
        add(checkoutButton);

        logoutButton = new JButton("Logout");
        logoutButton.setBounds(150, 280, 180, 40);
        logoutButton.addActionListener(this);
        add(logoutButton);
        
        menuButton.addActionListener(e -> {

            new FoodMenuFrame();
            dispose();

        });

        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == menuButton) {

            // Open Food Menu Page
            new FoodMenuPage();
            dispose();

        } else if (e.getSource() == cartButton) {

            // Open Cart Page
            new CartPage();
            dispose();

        } else if (e.getSource() == checkoutButton) {

            // Open Checkout Page
            new CheckoutPage(500);
            dispose();

        } else if (e.getSource() == logoutButton) {

            JOptionPane.showMessageDialog(this,
                    "Logged Out Successfully!");

            new LoginFrame();
            dispose();
        }
    }

    public static void main(String[] args) {
        new HomeFrame();
    }
}
