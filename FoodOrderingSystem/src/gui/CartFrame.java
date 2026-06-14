package gui;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

public class CartFrame extends JFrame implements ActionListener {

    JLabel titleLabel;
    JTextArea cartArea;
    JButton checkoutButton, backButton;

    public CartFrame() {

        setTitle("Cart");
        setSize(500, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        titleLabel = new JLabel("YOUR CART");
        titleLabel.setBounds(200, 20, 150, 30);
        add(titleLabel);
        getContentPane().setBackground(new Color(255, 255, 0)); // Yellow
        

        cartArea = new JTextArea();
        cartArea.setEditable(false);

        // Sample cart items
        cartArea.setText(
                "Burger - ₹120\n" +
                "Pizza - ₹250\n" +
                "Juice - ₹50\n\n" +
                "Total = ₹420"
        );

        JScrollPane scrollPane = new JScrollPane(cartArea);
        scrollPane.setBounds(80, 70, 320, 180);
        add(scrollPane);

        checkoutButton = new JButton("Checkout");
        checkoutButton.setBounds(80, 290, 140, 40);
        checkoutButton.addActionListener(e -> {
            System.out.println("Checkout button clicked");
            new CheckoutFrame();
            dispose();
        });
        

        backButton = new JButton("Back");
        backButton.setBounds(260, 290, 140, 40);
        backButton.addActionListener(this);
        add(backButton);
        add(checkoutButton);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == checkoutButton) {

            JOptionPane.showMessageDialog(this,
                    "Proceeding to Checkout...");

            // Open Checkout Frame
            // new CheckoutFrame();

            dispose();

        } else if (e.getSource() == backButton) {

            new FoodMenuFrame();
            dispose();
        }
    }

    public static void main(String[] args) {
        new CartFrame();
    }
}
