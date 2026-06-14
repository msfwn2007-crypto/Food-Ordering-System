 package gui;
 
 import java.awt.Color;

import javax.swing.*;

import java.awt.*;

 public class LoginFrame extends JFrame {

     public LoginFrame() {
    	 
    	 
         setTitle("Food Ordering System-Login");
         setSize(300, 200);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setLayout(null);
         getContentPane().setBackground(new Color(240, 255, 240)); // Light green
         

         JLabel emailLabel = new JLabel("Email:");
         emailLabel.setBounds(20, 20, 80, 25);
         add(emailLabel);

         JTextField emailField = new JTextField();
         emailField.setBounds(100, 20, 150, 25);
         add(emailField);

         JLabel passLabel = new JLabel("Password:");
         passLabel.setBounds(20, 60, 80, 25);
         add(passLabel);

         JPasswordField passField = new JPasswordField();
         passField.setBounds(100, 60, 150, 25);
         add(passField);

         JButton loginButton = new JButton("Login");
         loginButton.setBounds(100, 100, 100, 30);
         add(loginButton);

         loginButton.addActionListener(e -> { 
        	
        	 // Login validation here

        	    new HomeFrame();
        	    dispose();
        	    
             String email = emailField.getText();
             String password = new String(passField.getPassword());

             if(email.equals("admin@gmail.com") && password.equals("123")) {
                 JOptionPane.showMessageDialog(this,
                         "Login Successful");
             } else {
                 JOptionPane.showMessageDialog(this,
                         "Invalid Email or Password");
             }
         });

         setVisible(true);
     }

     public static void main(String[] args) {
         new LoginFrame();
     }
 }