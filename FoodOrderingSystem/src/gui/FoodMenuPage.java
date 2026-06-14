package gui;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class FoodMenuPage extends JFrame {

    private static final long serialVersionUID = 1L;

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
            50, 100, 80,
            40, 30, 180
    };

    String[] imagePaths = {
            "images/burger.jpeg",
            "images/pizza.jpeg",
            "images/shawarma.jpeg",
            "images/friedrice.jpeg",
            "images/chickenbiriyani.jpeg",
            "images/vegbiriyani.jpeg",
            "images/noodles.jpeg",
            "images/sandwich.jpeg",
            "images/fries.jpeg",
            "images/icecream.jpeg",
            "images/cake.jpeg",
            "images/dosa.jpeg",
            "images/idli.jpeg",
            "images/porotta.jpeg",
            "images/chickencurry.jpeg"
    };

    public FoodMenuPage() {

        setTitle("Food Ordering System - Food Menu");
        setSize(1100, 750);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel mainPanel = new JPanel(new BorderLayout());

        JLabel titleLabel = new JLabel("FOOD MENU", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 28));
        mainPanel.add(titleLabel, BorderLayout.NORTH);

        JPanel foodPanel = new JPanel(new GridLayout(0, 3, 15, 15));

        for (int i = 0; i < foodNames.length; i++) {

            JPanel itemPanel = new JPanel();
            itemPanel.setLayout(new BoxLayout(itemPanel, BoxLayout.Y_AXIS));
            itemPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY));

            ImageIcon icon = new ImageIcon(imagePaths[i]);

            if (icon.getIconWidth() > 0) {
                Image img = icon.getImage().getScaledInstance(
                        150, 120, Image.SCALE_SMOOTH);
                icon = new ImageIcon(img);
            }

            JLabel imageLabel = new JLabel(icon);
            imageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

            JLabel nameLabel = new JLabel(foodNames[i]);
            nameLabel.setFont(new Font("Arial", Font.BOLD, 16));
            nameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

            JLabel priceLabel = new JLabel("₹" + prices[i]);
            priceLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

            JButton addButton = new JButton("Add To Cart");
            addButton.setAlignmentX(Component.CENTER_ALIGNMENT);

            final int index = i;

            addButton.addActionListener(e -> {
                cartItems.add(foodNames[index]);
                cartPrices.add(prices[index]);

                JOptionPane.showMessageDialog(
                        this,
                        foodNames[index] + " added to cart!"
                );
            });

            itemPanel.add(imageLabel);
            itemPanel.add(Box.createVerticalStrut(5));
            itemPanel.add(nameLabel);
            itemPanel.add(priceLabel);
            itemPanel.add(Box.createVerticalStrut(5));
            itemPanel.add(addButton);

            foodPanel.add(itemPanel);
        }

        JScrollPane scrollPane = new JScrollPane(foodPanel);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel();

        JButton homeBtn = new JButton("Back To Home");
        JButton cartBtn = new JButton("Go To Cart");

        homeBtn.addActionListener(e -> {
            try {
                new HomePage().setVisible(true);
                dispose();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(
                        this,
                        "HomePage not found!"
                );
            }
        });

        cartBtn.addActionListener(e -> {
            try {
                new CartPage().setVisible(true);
                dispose();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(
                        this,
                        "CartPage not found!"
                );
            }
        });

        bottomPanel.add(homeBtn);
        bottomPanel.add(cartBtn);

        mainPanel.add(bottomPanel, BorderLayout.SOUTH);

        add(mainPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FoodMenuPage page = new FoodMenuPage();
            page.setVisible(true);
        });
    }
}

