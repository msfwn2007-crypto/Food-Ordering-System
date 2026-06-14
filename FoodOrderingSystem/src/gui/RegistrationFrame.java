package gui;

import javax.swing.*;

import java.awt.event.*;

import java.awt.*;

public class RegistrationFrame extends JFrame implements ActionListener {

    JLabel nameLabel, emailLabel, passwordLabel;
    JTextField nameField, emailField;
    JPasswordField passwordField;
    JButton registerButton, clearButton;
    
    private JButton nextButton; //Declaration only

    public RegistrationFrame() {
    	
    	 
        setTitle("Food Ordering System-User Registration");
        setSize(400, 300);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(173, 216, 230)); // Light blue
        
        nextButton = new JButton("Next");
        nextButton.setBounds(150, 220, 100, 30);

        add(nextButton);

        nextButton.addActionListener(e -> {
            System.out.println("Next button clicked");
            new LoginFrame();
            dispose();
        });

     
         

        // Name Label
        nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 50, 100, 25);
        add(nameLabel);

        // Name Text Field
        nameField = new JTextField();
        nameField.setBounds(150, 50, 180, 25);
        add(nameField);

        // Email Label
        emailLabel = new JLabel("Email:");
        emailLabel.setBounds(50, 90, 100, 25);
        add(emailLabel);

        // Email Text Field
        emailField = new JTextField();
        emailField.setBounds(150, 90, 180, 25);
        add(emailField);

        // Password Label
        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 130, 100, 25);
        add(passwordLabel);

        // Password Field
        passwordField = new JPasswordField();
        passwordField.setBounds(150, 130, 180, 25);
        add(passwordField);

        // Register Button
        registerButton = new JButton("Register");
        registerButton.setBounds(80, 190, 100, 30);
        registerButton.addActionListener(this);
        add(registerButton);

        // Clear Button
        clearButton = new JButton("Clear");
        clearButton.setBounds(220, 190, 100, 30);
        clearButton.addActionListener(this);
        add(clearButton);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == registerButton) {

            String name = nameField.getText();
            String email = emailField.getText();
            String password = String.valueOf(passwordField.getPassword());

            if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "All fields are required!",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this,
                        "Registration Successful!\nWelcome " + name);

                System.out.println("Name: " + name);
                System.out.println("Email: " + email);
                System.out.println("Password: " + password);
            }
        }

        if (e.getSource() == clearButton) {
            nameField.setText("");
            emailField.setText("");
            passwordField.setText("");
        }
    }
   

    public static void main(String[] args) {
        new RegistrationFrame();
    }
}
