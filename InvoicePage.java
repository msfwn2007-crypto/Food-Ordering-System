/**
 * 
 */
package org.ictkerala.student;
import javax.swing.*;
import java.awt.*;

public class InvoicePage extends JFrame {

    // Constructor matching the exact parameter layout from your Checkout Page
    public InvoicePage(String name, String phone, String address, int totalAmount, String paymentMethod) {
        
        // Frame Configurations
        setTitle("Food Ordering System - Invoice Receipt");
        setSize(500, 600);
        setLocationRelativeTo(null); // Centers window on screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Core Container Setup
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.WHITE); // White background for a clean paper look

        // 1. Header Section
        JLabel titleLabel = new JLabel("INVOICE RECEIPT");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 22));
        titleLabel.setBounds(150, 20, 200, 30);
        panel.add(titleLabel);

        JSeparator line1 = new JSeparator();
        line1.setBounds(30, 65, 420, 10);
        panel.add(line1);

        // 2. Customer Profile Details
        JLabel nameLabel = new JLabel("Customer Name: " + name);
        nameLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        nameLabel.setBounds(40, 90, 400, 25);
        panel.add(nameLabel);

        JLabel phoneLabel = new JLabel("Phone Number: " + phone);
        phoneLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        phoneLabel.setBounds(40, 130, 400, 25);
        panel.add(phoneLabel);

        JLabel addressLabel = new JLabel("Delivery Address:");
        addressLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        addressLabel.setBounds(40, 170, 400, 25);
        panel.add(addressLabel);

        // JTextArea handles multi-line address wrapping elegantly without fields overlapping
        JTextArea displayAddress = new JTextArea(address);
        displayAddress.setFont(new Font("Arial", Font.PLAIN, 14));
        displayAddress.setBounds(40, 200, 400, 60);
        displayAddress.setEditable(false);
        displayAddress.setOpaque(false); // Seamless blends into frame background
        displayAddress.setLineWrap(true);
        displayAddress.setWrapStyleWord(true);
        panel.add(displayAddress);

        JSeparator line2 = new JSeparator();
        line2.setBounds(30, 280, 420, 10);
        panel.add(line2);

        // 3. Billing & Payment Breakdown
        JLabel paymentLabel = new JLabel("Payment Method: " + paymentMethod);
        paymentLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        paymentLabel.setBounds(40, 310, 400, 25);
        panel.add(paymentLabel);

        JLabel totalLabel = new JLabel("Total Paid: ₹" + totalAmount);
        totalLabel.setFont(new Font("Arial", Font.BOLD, 18));
        totalLabel.setForeground(new Color(34, 139, 34)); // Distinct Forest Green text for success totals
        totalLabel.setBounds(40, 360, 400, 30);
        panel.add(totalLabel);

        // 4. Action Button (Closes app once user is done viewing transaction)
        JButton closeBtn = new JButton("Close Application");
        closeBtn.setBounds(150, 460, 200, 40);
        closeBtn.setFont(new Font("Arial", Font.BOLD, 14));
        closeBtn.addActionListener(e -> System.exit(0));
        panel.add(closeBtn);

        // Display view bindings
        add(panel);
    }
}