package com.bookshop.gui;

import com.bookshop.common.ViewConstants;
import com.bookshop.common.GUIUtility;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
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
        userIdTxt.setToolTipText("Enter your UserId/EmailId");
        panel.add(userIdTxt);

        //PasswordLabel
        JLabel passwordLabel = new JLabel("Password :");
        passwordLabel.setFont(new Font(ViewConstants.Tahoma.name(), 1, 12));
        passwordLabel.setBounds(30, 330, 70, 30);
        passwordLabel.setToolTipText("Enter your password");
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
        loginButton.addActionListener(e -> validateCredentials());

        //CancelButton
        JButton cancelButton = new JButton("Cancel");
        cancelButton.setFont(new Font(ViewConstants.Tahoma.name(), 1, 12));
        cancelButton.setForeground(new Color(0, 0, 153));
        cancelButton.setBounds(260, 390, 90, 30);
        panel.add(cancelButton);
        cancelButton.addActionListener(e -> System.exit(0));
    }

    private static void validateCredentials()
    {

    }

    public void errorDialog(String message) {
        try {
            final JDialog dialog = new JDialog();
            dialog.setTitle("Error");
            dialog.setModal(true);
            dialog.setAlwaysOnTop(true);
            JTextArea jTextArea = new JTextArea(message);
            jTextArea.setMargin(new Insets(5, 5, 5, 5));
            jTextArea.setTabSize(4);
            jTextArea.setEditable(false);
            jTextArea.setWrapStyleWord(true);
            dialog.add(new JScrollPane(jTextArea), BorderLayout.CENTER);
            JPanel jPanel = new JPanel(new FlowLayout(FlowLayout.TRAILING));
            JButton jButton = new JButton(new AbstractAction("OK") {
                public void actionPerformed(ActionEvent e) {
                    dialog.dispose();
                }
            });
            jPanel.setBorder(new EmptyBorder(1, 5, 1, 5));
            jPanel.add(jButton);
            dialog.add(jPanel, BorderLayout.SOUTH);
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setSize(400, 300);
            GUIUtility.center(dialog);
            dialog.setVisible(true);
        } catch (SecurityException e1) {
            e1.printStackTrace();
        }
        System.exit(0);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setIconImage(new ImageIcon("images/logo.png").getImage());
        frame.setSize(468, 489);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        GUIUtility.center(frame);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }
}
