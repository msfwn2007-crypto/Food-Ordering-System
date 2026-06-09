package org.ictkerala.student;

import javax.swing.*;
import java.awt.*;

public class CheckoutPage extends JFrame {

    private JTextField nameField;
    private JTextField phoneField;
    private JTextArea addressArea;
    private JComboBox<String> paymentBox;
    private int totalAmount;

    public CheckoutPage(int totalAmount) {

        this.totalAmount = totalAmount;

        setTitle("Food Ordering System - Checkout");
        setSize(700, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel titleLabel = new JLabel("CHECKOUT PAGE");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setBounds(230, 20, 250, 30);

        JLabel nameLabel = new JLabel("Customer Name:");
        nameLabel.setBounds(50, 80, 130, 25);

        nameField = new JTextField();
        nameField.setBounds(220, 80, 250, 30);

        JLabel phoneLabel = new JLabel("Phone Number:");
        phoneLabel.setBounds(50, 130, 130, 25);

        phoneField = new JTextField();
        phoneField.setBounds(220, 130, 250, 30);

        JLabel addressLabel = new JLabel("Delivery Address:");
        addressLabel.setBounds(50, 180, 130, 25);

        addressArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(addressArea);
        scrollPane.setBounds(220, 180, 250, 100);

        JLabel paymentLabel = new JLabel("Payment Method:");
        paymentLabel.setBounds(50, 310, 130, 25);

        String[] paymentMethods = {
                "Cash On Delivery",
                "UPI",
                "Credit Card",
                "Debit Card"
        };

        paymentBox = new JComboBox<>(paymentMethods);
        paymentBox.setBounds(220, 310, 250, 30);

        JLabel totalLabel = new JLabel("Total Amount : ₹" + totalAmount);
        totalLabel.setFont(new Font("Arial", Font.BOLD, 18));
        totalLabel.setBounds(220, 360, 250, 30);

        JButton backBtn = new JButton("Back To Cart");
        backBtn.setBounds(150, 450, 150, 40);

        JButton placeOrderBtn = new JButton("Place Order");
        placeOrderBtn.setBounds(350, 450, 150, 40);

        // Back Button
        backBtn.addActionListener(e -> {
            dispose();

            // Uncomment only if CartPage exists
            // new CartPage().setVisible(true);
        });

        // Place Order Button
        placeOrderBtn.addActionListener(e -> {

            String name = nameField.getText().trim();
            String phone = phoneField.getText().trim();
            String address = addressArea.getText().trim();
            String paymentMethod =
                    paymentBox.getSelectedItem().toString();

            if (name.isEmpty() ||
                phone.isEmpty() ||
                address.isEmpty()) {

                JOptionPane.showMessageDialog(
                        this,
                        "Please fill all fields!"
                );
                return;
            }

            if (!phone.matches("\\d{10}")) {

                JOptionPane.showMessageDialog(
                        this,
                        "Enter a valid 10-digit phone number!"
                );
                return;
            }

            JOptionPane.showMessageDialog(
                    this,
                    "Order Placed Successfully!\n" +
                    "Payment Method: " + paymentMethod
            );

            /*
             * Uncomment only if InvoicePage exists
             *
             * InvoicePage invoice =
             * new InvoicePage(name, phone,
             * address, totalAmount,
             * paymentMethod);
             *
             * invoice.setVisible(true);
             */

            dispose();
        });

        panel.add(titleLabel);
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(phoneLabel);
        panel.add(phoneField);
        panel.add(addressLabel);
        panel.add(scrollPane);
        panel.add(paymentLabel);
        panel.add(paymentBox);
        panel.add(totalLabel);
        panel.add(backBtn);
        panel.add(placeOrderBtn);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->
                new CheckoutPage(500));
    }
}
