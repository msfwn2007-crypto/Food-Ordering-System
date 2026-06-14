package gui;

import javax.swing.*;
import java.awt.*;

public class InvoicePage extends JFrame {

    private static final long serialVersionUID = 1L;

    public InvoicePage(String name, String phone,
                       String address,
                       int totalAmount,
                       String paymentMethod) {

        setTitle("Food Ordering System - Invoice");
        setSize(500, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.WHITE);

        JLabel titleLabel = new JLabel("INVOICE RECEIPT");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 22));
        titleLabel.setBounds(140, 20, 250, 30);
        panel.add(titleLabel);

        JSeparator separator1 = new JSeparator();
        separator1.setBounds(30, 60, 420, 10);
        panel.add(separator1);

        JLabel nameLabel = new JLabel("Customer Name : " + name);
        nameLabel.setBounds(40, 90, 400, 25);
        panel.add(nameLabel);

        JLabel phoneLabel = new JLabel("Phone Number : " + phone);
        phoneLabel.setBounds(40, 130, 400, 25);
        panel.add(phoneLabel);

        JLabel addressLabel = new JLabel("Delivery Address :");
        addressLabel.setBounds(40, 170, 200, 25);
        panel.add(addressLabel);

        JTextArea addressArea = new JTextArea(address);
        addressArea.setBounds(40, 200, 380, 60);
        addressArea.setEditable(false);
        addressArea.setLineWrap(true);
        addressArea.setWrapStyleWord(true);
        addressArea.setBackground(Color.WHITE);
        panel.add(addressArea);

        JSeparator separator2 = new JSeparator();
        separator2.setBounds(30, 290, 420, 10);
        panel.add(separator2);

        JLabel paymentLabel = new JLabel("Payment Method : " + paymentMethod);
        paymentLabel.setBounds(40, 320, 300, 25);
        panel.add(paymentLabel);

        JLabel totalLabel = new JLabel("Total Amount Paid : ₹" + totalAmount);
        totalLabel.setFont(new Font("Arial", Font.BOLD, 18));
        totalLabel.setForeground(new Color(0, 128, 0));
        totalLabel.setBounds(40, 370, 300, 30);
        panel.add(totalLabel);

        JButton finishBtn = new JButton("Finish");
        finishBtn.setBounds(170, 470, 140, 40);

        finishBtn.addActionListener(e -> {
            JOptionPane.showMessageDialog(
                    this,
                    "Thank You For Ordering!\nVisit Again."
            );
            dispose();
        });

        panel.add(finishBtn);

        add(panel);
    }
    public void displayInvoice() {

        System.out.println("\n===== INVOICE =====");
        System.out.println("Order Confirmed");
        System.out.println("Thank You For Ordering!");
        System.out.println("Total Amount: ₹500");
    }

    public static void main(String[] args) {

        InvoicePage invoice = new InvoicePage(
                "Safwan",
                "9876543210",
                "Kochi, Kerala",
                500,
                "UPI"
        );

        invoice.setVisible(true);
    }
}
