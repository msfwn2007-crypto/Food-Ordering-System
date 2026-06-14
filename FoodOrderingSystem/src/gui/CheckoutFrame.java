package gui;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

public class CheckoutFrame extends JFrame implements ActionListener {

    JLabel titleLabel, totalLabel;
    JTextField addressField;
    JButton placeOrderButton, backButton;

    public CheckoutFrame() {

        setTitle("Checkout");
        setSize(500, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(255, 215, 0)); // Gold
        

        titleLabel = new JLabel("CHECKOUT");
        titleLabel.setBounds(200, 30, 150, 30);
        add(titleLabel);

        JLabel addressLabel = new JLabel("Delivery Address:");
        addressLabel.setBounds(50, 100, 120, 25);
        add(addressLabel);

        addressField = new JTextField();
        addressField.setBounds(180, 100, 250, 30);
        add(addressField);

        totalLabel = new JLabel("Total Amount: ₹420");
        totalLabel.setBounds(50, 170, 200, 30);
        add(totalLabel);

        placeOrderButton = new JButton("Place Order");
        placeOrderButton.setBounds(80, 260, 140, 40);
        placeOrderButton.addActionListener(this);
        add(placeOrderButton);

        backButton = new JButton("Back");
        backButton.setBounds(260, 260, 140, 40);
        backButton.addActionListener(this);
        add(backButton);
        placeOrderButton.addActionListener(e -> {

            new CheckoutFrame();
            dispose();

        });

        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == placeOrderButton) {

            String address = addressField.getText();

            if (address.isEmpty()) {

                JOptionPane.showMessageDialog(this,
                        "Please enter delivery address!");

            } else {

                JOptionPane.showMessageDialog(this,
                        "Order Placed Successfully!");

                new InvoiceFrame();
                dispose();
            }

        } else if (e.getSource() == backButton) {

            new CartFrame();
            dispose();
        }
    }

    public static void main(String[] args) {
        new CheckoutFrame();
    }
}
