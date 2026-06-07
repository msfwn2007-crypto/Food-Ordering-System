/**
 * 
 */
package org.ictkerala.student;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class CartPage extends JFrame {

    private JTable cartTable;
    private DefaultTableModel model;
    private JLabel totalLabel;

    public CartPage() {

        setTitle("Food Ordering System - Cart");
        setSize(800, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        String[] columns = {
                "Food Item",
                "Price (₹)"
        };

        model = new DefaultTableModel(columns, 0);

        int total = 0;

        for (int i = 0; i < FoodMenuPage.cartItems.size(); i++) {

            model.addRow(new Object[]{
                    FoodMenuPage.cartItems.get(i),
                    FoodMenuPage.cartPrices.get(i)
            });

            total += FoodMenuPage.cartPrices.get(i);
        }

        cartTable = new JTable(model);

        JScrollPane scrollPane =
                new JScrollPane(cartTable);

        totalLabel =
                new JLabel("Total Amount : ₹" + total);

        totalLabel.setFont(
                new Font("Arial",
                        Font.BOLD,
                        18));

        JButton removeBtn =
                new JButton("Remove Item");

        JButton foodMenuBtn =
                new JButton("Back to Food Menu");

        JButton checkoutBtn =
                new JButton("Checkout");

        // Remove Item
        removeBtn.addActionListener(e -> {

            int row =
                    cartTable.getSelectedRow();

            if (row >= 0) {

                FoodMenuPage.cartItems.remove(row);
                FoodMenuPage.cartPrices.remove(row);

                model.removeRow(row);

                updateTotal();

            } else {

                JOptionPane.showMessageDialog(
                        this,
                        "Please select an item to remove."
                );
            }
        });

        // Back to Food Menu
        foodMenuBtn.addActionListener(e -> {

            new FoodMenuPage();

            dispose();
        });

        // Checkout
        checkoutBtn.addActionListener(e -> {

            int grandTotal = 0;

            for (int price :
                    FoodMenuPage.cartPrices) {

                grandTotal += price;
            }

            if (grandTotal == 0) {

                JOptionPane.showMessageDialog(
                        this,
                        "Cart is empty!"
                );

                return;
            }

            new CheckoutPage(grandTotal);

            dispose();
        });

        JPanel buttonPanel = new JPanel();

        buttonPanel.add(removeBtn);
        buttonPanel.add(foodMenuBtn);
        buttonPanel.add(checkoutBtn);

        JPanel bottomPanel =
                new JPanel(new BorderLayout());

        bottomPanel.add(
                totalLabel,
                BorderLayout.WEST);

        bottomPanel.add(
                buttonPanel,
                BorderLayout.EAST);

        add(scrollPane,
                BorderLayout.CENTER);

        add(bottomPanel,
                BorderLayout.SOUTH);

        setVisible(true);
    }

    private void updateTotal() {

        int total = 0;

        for (int price :
                FoodMenuPage.cartPrices) {

            total += price;
        }

        totalLabel.setText(
                "Total Amount : ₹" + total);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new CartPage();
        });
    }
}