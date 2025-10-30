package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Spring2024 implements ActionListener {
    JFrame frame ;
    JLabel label;
    JTextField textField;
    JButton button;

    Spring2024(){
        frame = new JFrame("Spring 2024");
        frame.setSize(400,200);
        frame.setLayout(null);

        label = new JLabel("10");
        label.setBackground(new Color(0xADADAD));
        label.setOpaque(true);
        label.setBounds(150,20,100,20);

        textField = new JTextField();
        textField.setBounds(150,70,100,25);

        button = new JButton("Perform");
        button.setBounds(150,120,100,25);
        button.addActionListener(this);

        frame.add(label);
        frame.add(textField);
        frame.add(button);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Spring2024();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String labelText = label.getText();
        int num1 = Integer.parseInt(labelText);

        String[] parts = textField.getText().split(" ");
        String operator = parts[0];
        int num2 = Integer.parseInt(parts[1]);

        int result = 0;

        if(operator.equals("+")){
            result = num1 + num2 ;
        }
        else if(operator.equals("-")){
            result = num1 - num2 ;
        }
        else if(operator.equals("*")){
            result = num1 * num2 ;
        }
        else if(operator.equals("/")){
            result = num1 / num2 ;
        }

        System.out.println(result);
        String resultString = String.valueOf(result);
        label.setText(resultString);



    }
}
