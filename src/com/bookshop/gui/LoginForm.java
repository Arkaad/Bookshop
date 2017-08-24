package com.bookshop.gui;

import com.bookshop.common.ViewConstants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm {

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        //ImageLabel
        JLabel imageLabel = new JLabel(new ImageIcon("images/logo.png"));
        imageLabel.setBounds(130, 10, 204, 190);
        panel.add(imageLabel);

        //TitleLabel
        JLabel titleLabel = new JLabel("Book Shop Management Suite");
        titleLabel.setFont(new Font(ViewConstants.Tahoma.name(), 1, 18));
        titleLabel.setForeground(new Color(0, 0, 204));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setBounds(50, 220, 360, 30);
        panel.add(titleLabel);

        //UserIdLabel
        JLabel userIdLabel = new JLabel("User ID :");
        userIdLabel.setFont(new Font(ViewConstants.Tahoma.name(), 1, 12));
        userIdLabel.setBounds(30, 280, 60, 30);
        panel.add(userIdLabel);

        //UserIdTextField
        JTextField userIdTxt = new JTextField();
        userIdTxt.setBounds(110, 280, 270, 30);
        panel.add(userIdTxt);

        //PasswordLabel
        JLabel passwordLabel = new JLabel("Password :");
        passwordLabel.setFont(new Font(ViewConstants.Tahoma.name(), 1, 12));
        passwordLabel.setBounds(30, 330, 70, 30);
        panel.add(passwordLabel);

        //PasswordField
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(110, 330, 270, 30);
        panel.add(passwordField);

        //LoginButton
        JButton loginButton = new JButton("Log In");
        loginButton.setFont(new Font(ViewConstants.Tahoma.name(), 1, 12));
        loginButton.setForeground(new Color(0, 0, 153));
        loginButton.setBounds(110, 390, 90, 30);
        panel.add(loginButton);

        //CancelButton
        JButton cancelButton = new JButton("Cancel");
        cancelButton.setFont(new Font(ViewConstants.Tahoma.name(), 1, 12));
        cancelButton.setForeground(new Color(0, 0, 153));
        cancelButton.setBounds(260, 390, 90, 30);
        panel.add(cancelButton);
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setIconImage(new ImageIcon("images/logo.png").getImage());
        frame.setSize(468, 489);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }
}
