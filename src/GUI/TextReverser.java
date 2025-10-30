package GUI;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextReverser implements ActionListener {
    JTextField input, output;
    JButton reverse;

    TextReverser() {
        JFrame f = new JFrame("Text Reverser");
        f.setLayout(new FlowLayout());
        f.setSize(300, 150);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        input = new JTextField(10);
        output = new JTextField(10);
        output.setEditable(false);
        reverse = new JButton("Reverse");

        f.add(new JLabel("Input:"));
        f.add(input);
        f.add(reverse);
        f.add(new JLabel("Output:"));
        f.add(output);

        reverse.addActionListener(this);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String text = input.getText();
        output.setText(new StringBuilder(text).reverse().toString());
    }

    public static void main(String[] args) {
        new TextReverser();
    }
}
