package org.ictkerala.student;

import javax.swing.*;
import java.awt.*;

public class CartPage extends JFrame {

    private static final long serialVersionUID = 1L;

    public CartPage() {

        setTitle("Food Ordering System - Cart");
        setSize(600, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());

        JLabel titleLabel = new JLabel("YOUR CART", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 22));

        JTextArea cartArea = new JTextArea();
        cartArea.setEditable(false);

        int total = 0;

        for (int i = 0; i < FoodMenuPage.cartItems.size(); i++) {

            cartArea.append(
                    FoodMenuPage.cartItems.get(i)
                    + " - ₹"
                    + FoodMenuPage.cartPrices.get(i)
                    + "\n"
            );

            total += FoodMenuPage.cartPrices.get(i);
        }

        cartArea.append("\n-----------------------");
        cartArea.append("\nTotal Amount = ₹" + total);

        JScrollPane scrollPane = new JScrollPane(cartArea);

        JPanel buttonPanel = new JPanel();

        JButton backBtn = new JButton("Back To Menu");
        JButton checkoutBtn = new JButton("Checkout");

        int finalTotal = total;

        backBtn.addActionListener(e -> {
            new FoodMenuPage().setVisible(true);
            dispose();
        });

        checkoutBtn.addActionListener(e -> {

            if (finalTotal == 0) {

                JOptionPane.showMessageDialog(
                        this,
                        "Cart is Empty!"
                );

                return;
            }

            new CheckoutPage(finalTotal).setVisible(true);
            dispose();
        });

        buttonPanel.add(backBtn);
        buttonPanel.add(checkoutBtn);

        panel.add(titleLabel, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(buttonPanel, BorderLayout.SOUTH);

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CartPage().setVisible(true);
        });
    }
}
