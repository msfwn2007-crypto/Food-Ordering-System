package gui;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

public class FoodMenuFrame extends JFrame implements ActionListener {

    JLabel titleLabel;
    JCheckBox burger, pizza, sandwich, juice;
    JButton addToCartButton, backButton;

    public FoodMenuFrame() {

        setTitle("Food Menu");
        setSize(500, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        titleLabel = new JLabel("FOOD MENU");
        titleLabel.setBounds(190, 20, 150, 30);
        add(titleLabel);

        burger = new JCheckBox("Burger - ₹120");
        burger.setBounds(100, 80, 200, 30);
        add(burger);

        pizza = new JCheckBox("Pizza - ₹250");
        pizza.setBounds(100, 120, 200, 30);
        add(pizza);

        sandwich = new JCheckBox("Sandwich - ₹80");
        sandwich.setBounds(100, 160, 200, 30);
        add(sandwich);

        juice = new JCheckBox("Juice - ₹50");
        juice.setBounds(100, 200, 200, 30);
        add(juice);
        getContentPane().setBackground(new Color(255, 0, 0)); // Red
        

        addToCartButton = new JButton("Add To Cart");
        addToCartButton.setBounds(80, 280, 140, 40);
        addToCartButton.addActionListener(this);
        add(addToCartButton);

        backButton = new JButton("Back");
        backButton.setBounds(260, 280, 140, 40);
        backButton.addActionListener(this);
        add(backButton);
        addToCartButton.addActionListener(e -> {

            new CartFrame();
            dispose();

        });

        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == addToCartButton) {

            String cartItems = "";

            if (burger.isSelected())
                cartItems += "Burger - ₹120\n";

            if (pizza.isSelected())
                cartItems += "Pizza - ₹250\n";

            if (sandwich.isSelected())
                cartItems += "Sandwich - ₹80\n";

            if (juice.isSelected())
                cartItems += "Juice - ₹50\n";

            if (cartItems.isEmpty()) {

                JOptionPane.showMessageDialog(this,
                        "Please select at least one item!");

            } else {

                JOptionPane.showMessageDialog(this,
                        "Items Added To Cart:\n\n" + cartItems);

                // Open Cart Page later
                // new CartPage();

            }

        } else if (e.getSource() == backButton) {

            new HomeFrame();
            dispose();
        }
    }

    public static void main(String[] args) {
        new FoodMenuFrame();
    }
}