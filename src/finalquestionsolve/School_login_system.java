package finalquestionsolve;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class registration implements ActionListener {
    JFrame frame;
    JButton b;
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;

    // static so login class can access them
    static String username1;
    static String password1;

    registration() {
        frame = new JFrame("Registration Page");
        frame.setSize(400, 400);
        frame.setLayout(new FlowLayout());

        l1 = new JLabel("Full Name");
        t1 = new JTextField(10);
        l2 = new JLabel("username");
        t2 = new JTextField(10);
        l3 = new JLabel("password");
        t3 = new JTextField(10);

        b = new JButton("Register");
        b.addActionListener(this);

        frame.add(l1);
        frame.add(t1);
        frame.add(l2);
        frame.add(t2);
        frame.add(l3);
        frame.add(t3);
        frame.add(b);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        username1 = t2.getText();
        password1 = t3.getText();

        if (username1.equals("") || password1.equals("")) {
            JOptionPane.showMessageDialog(frame, "All fields are required");
        } else {
            JOptionPane.showMessageDialog(frame, "Registration Successful");
            frame.dispose();
            new login();
        }
    }
}

class login implements ActionListener {
    JFrame frame;
    JButton b;
    JLabel l1, l2;
    JTextField t1, t2;

    login() {
        frame = new JFrame("Login Page");
        frame.setSize(400, 400);
        frame.setLayout(new FlowLayout());

        l1 = new JLabel("Username");
        t1 = new JTextField(10);
        l2 = new JLabel("Password");
        t2 = new JTextField(10);
        b = new JButton("Login");
        b.addActionListener(this);

        frame.add(l1);
        frame.add(t1);
        frame.add(l2);
        frame.add(t2);
        frame.add(b);

        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = t1.getText();
        String password = t2.getText();

        if (username.equals(registration.username1) && password.equals(registration.password1)) {
            JOptionPane.showMessageDialog(frame, "Login Successful");
            frame.dispose();
            new home();
        } else {
            JOptionPane.showMessageDialog(frame, "Invalid username or password");
        }
    }
}

class home implements ActionListener {
    home() {
        JFrame frame = new JFrame("Home Page");
        frame.setSize(300, 200);
        JLabel label = new JLabel("Welcome to the Home Page!", SwingConstants.CENTER);
        frame.add(label);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // No action needed for now
    }
}

public class School_login_system {
    public static void main(String[] args) {
        new registration();
    }
}
