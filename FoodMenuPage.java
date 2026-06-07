/**
 * 
 */
package org.ictkerala.student;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class FoodMenuPage extends JFrame {

    public static ArrayList<String> cartItems = new ArrayList<>();
    public static ArrayList<Integer> cartPrices = new ArrayList<>();

    String[] foodNames = {
            "Burger", "Pizza", "Shawarma", "Fried Rice", "Chicken Biryani",
            "Veg Biryani", "Noodles", "Sandwich", "French Fries", 
              "Ice Cream", "Chocolate Cake", "Dosa",
            "Idli", "Porotta", "Chicken Curry"
    };

    int[] prices = {
            120, 250, 180, 150, 220,
            180, 140, 100, 90, 
             50, 10,
            10, 10, 10, 180
    };

    String[] imagePaths = {
            "images/burger.jpeg", "images/pizza.jpeg", "images/shawarma.jpeg", "images/friedrice.jpeg", "images/chickenbiriyani.jpeg",
            "images/vegbiriyani.jpeg", "images/noodles.jpeg", "images/sandwich.jpeg", "images/fries.jpeg",
              "images/icecream.jpeg", "images/cake.jpeg", "images/dosa.jpeg",
            "images/idli.jpeg", "images/porotta.jpeg", "images/chickencurry.jpeg"
    };

    public FoodMenuPage() {

        setTitle("Food Ordering System - Food Menu");
        setSize(1100, 750); // Increased slightly to give room for navigation buttons
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel mainPanel = new JPanel(new BorderLayout());

        // Header Title
        JLabel titleLabel = new JLabel("FOOD MENU", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 28));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0)); // Spacing around title
        mainPanel.add(titleLabel, BorderLayout.NORTH);

        // Scrollable Food Items Panel
        JPanel foodPanel = new JPanel(new GridLayout(0, 3, 15, 15));
        foodPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        for (int i = 0; i < foodNames.length; i++) {
            JPanel itemPanel = new JPanel();
            itemPanel.setLayout(new BoxLayout(itemPanel, BoxLayout.Y_AXIS));
            itemPanel.setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(Color.LIGHT_GRAY),
                    BorderFactory.createEmptyBorder(10, 10, 10, 10)
            ));

            ImageIcon icon = new ImageIcon(imagePaths[i]);
            Image img = icon.getImage().getScaledInstance(150, 120, Image.SCALE_SMOOTH);
            JLabel imageLabel = new JLabel(new ImageIcon(img));
            imageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

            JLabel nameLabel = new JLabel(foodNames[i]);
            nameLabel.setFont(new Font("Arial", Font.BOLD, 16));
            nameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

            JLabel priceLabel = new JLabel("₹" + prices[i]);
            priceLabel.setFont(new Font("Arial", Font.PLAIN, 14));
            priceLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

            JButton addButton = new JButton("Add To Cart");
            addButton.setAlignmentX(Component.CENTER_ALIGNMENT);

            final int index = i;
            addButton.addActionListener(e -> {
                cartItems.add(foodNames[index]);
                cartPrices.add(prices[index]);
                JOptionPane.showMessageDialog(this, foodNames[index] + " added to cart!");
            });

            itemPanel.add(imageLabel);
            itemPanel.add(Box.createRigidArea(new Dimension(0, 5)));
            itemPanel.add(nameLabel);
            itemPanel.add(Box.createRigidArea(new Dimension(0, 5)));
            itemPanel.add(priceLabel);
            itemPanel.add(Box.createRigidArea(new Dimension(0, 8)));
            itemPanel.add(addButton);

            foodPanel.add(itemPanel);
        }
     // Put the grid layout inside a scroll pane so users can browse up and down
        JScrollPane scrollPane = new JScrollPane(foodPanel);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        // --- NAVIGATION BUTTONS (ADDED SECTION) ---
        JPanel bottomNavPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 30, 15));
        
        JButton homeBtn = new JButton("Back To Home");
        homeBtn.setPreferredSize(new Dimension(160, 40));
        homeBtn.setFont(new Font("Arial", Font.BOLD, 14));
        
        JButton cartBtn = new JButton("Go To Cart");
        cartBtn.setPreferredSize(new Dimension(160, 40));
        cartBtn.setFont(new Font("Arial", Font.BOLD, 14));

        // Back to Home Logic
        homeBtn.addActionListener(e -> {
            new HomePage().setVisible(true); // Assumes your home screen class is named HomePage
            dispose(); // Close the menu window
        });

        // Go to Cart Logic
        cartBtn.addActionListener(e -> {
            new CartPage().setVisible(true); // Opens your cart window
            dispose();
        });

        bottomNavPanel.add(homeBtn);
        bottomNavPanel.add(cartBtn);
        mainPanel.add(bottomNavPanel, BorderLayout.SOUTH);

        // Render Frame
        add(mainPanel);
        setVisible(true);
    }
}