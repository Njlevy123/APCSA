/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gui;

/**
 *
 * @author nlevy2025
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;

public class GUI {
    private JFrame frame;
    private JTextField nameField, emailField, userField;
    private JPasswordField passField;
    private JButton registerButton;

    public BankAppGUI() {
        frame = new JFrame("User Registration");
        frame.setSize(350, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2));

        frame.add(new JLabel("Full Name:"));
        nameField = new JTextField();
        frame.add(nameField);

        frame.add(new JLabel("Email:"));
        emailField = new JTextField();
        frame.add(emailField);

        frame.add(new JLabel("Username:"));
        userField = new JTextField();
        frame.add(userField);

        frame.add(new JLabel("Password:"));
        passField = new JPasswordField();
        frame.add(passField);

        registerButton = new JButton("Register");
        frame.add(registerButton);

        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveUserData();
            }
        });

        frame.setVisible(true);
    }

    private void saveUserData() {
        String name = nameField.getText();
        String email = emailField.getText();
        String username = userField.getText();
        String password = new String(passField.getPassword());

        try (FileWriter fw = new FileWriter("", true)) {
            fw.write(name + "," + email + "," + username + "," + password + "\n");
            JOptionPane.showMessageDialog(frame, "User registered successfully!");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(frame, "Error saving user data.");
        }
    }

    public static void main(String[] args) {
        new BankAppGUI();
    }
}
