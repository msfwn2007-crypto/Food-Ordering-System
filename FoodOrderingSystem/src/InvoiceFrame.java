package gui;

import javax.swing.*;
import java.awt.event.*;

public class InvoiceFrame extends JFrame implements ActionListener {

    JLabel titleLabel;
    JTextArea invoiceArea;
    JButton finishButton;

    public InvoiceFrame() {

        setTitle("Invoice");
        setSize(500, 450);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        titleLabel = new JLabel("INVOICE");
        titleLabel.setBounds(210, 20, 100, 30);
        add(titleLabel);

        invoiceArea = new JTextArea();
        invoiceArea.setEditable(false);

        invoiceArea.setText(
                "=================================\n" +
                "      FOOD ORDERING SYSTEM\n" +
                "=================================\n\n" +
                "Burger          ₹120\n" +
                "Pizza           ₹250\n" +
                "Juice           ₹50\n\n" +
                "---------------------------------\n" +
                "Total Amount : ₹420\n" +
                "---------------------------------\n\n" +
                "Order Placed Successfully!\n" +
                "Thank You For Ordering.\n"
        );

        JScrollPane scrollPane = new JScrollPane(invoiceArea);
        scrollPane.setBounds(50, 70, 380, 220);
        add(scrollPane);

        finishButton = new JButton("Finish");
        finishButton.setBounds(180, 330, 120, 40);
        finishButton.addActionListener(this);
        add(finishButton);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == finishButton) {

            JOptionPane.showMessageDialog(this,
                    "Thank You For Using Food Ordering System!");

            new LoginFrame(); // or new HomeFrame();

            dispose();
        }
    }

    public static void main(String[] args) {
        new InvoiceFrame();
    }
}
