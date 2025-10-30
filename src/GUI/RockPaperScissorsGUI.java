package GUI;

import javax.swing.*;
import java.awt.event.*;

public class RockPaperScissorsGUI {

    // Function to generate random choice
    private static String getRandomChoice() {
        String[] options = {"Rock", "Paper", "Scissors"};
        return options[(int)(Math.random() * 3)];
    }

    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Rock Paper Scissors");
        frame.setSize(400, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create labels
        JLabel label1 = new JLabel("Player 1");
        label1.setBounds(50, 30, 120, 30);

        JLabel label2 = new JLabel("Player 2");
        label2.setBounds(230, 30, 120, 30);

        JLabel resultLabel = new JLabel("Result will be shown here");
        resultLabel.setBounds(100, 140, 250, 30);

        // Create buttons
        JButton leftButton = new JButton("Player 1 Play");
        leftButton.setBounds(50, 70, 120, 30);

        JButton rightButton = new JButton("Player 2 Play");
        rightButton.setBounds(230, 70, 120, 30);

        JButton checkButton = new JButton("Check Winner");
        checkButton.setBounds(140, 100, 120, 30);

        // Event handling for Player 1 Play
        leftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label1.setText(getRandomChoice());
            }
        });

        // Event handling for Player 2 Play
        rightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label2.setText(getRandomChoice());
            }
        });

        // Event handling for Check Winner
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String choice1 = label1.getText();
                String choice2 = label2.getText();
                String result;

                if(choice1.equals(choice2)) {
                    result = "Draw";
                } else if(
                        (choice1.equals("Rock") && choice2.equals("Scissors")) ||
                                (choice1.equals("Paper") && choice2.equals("Rock")) ||
                                (choice1.equals("Scissors") && choice2.equals("Paper"))
                ) {
                    result = "Player 1 Wins!";
                } else {
                    result = "Player 2 Wins!";
                }

                resultLabel.setText(result);
            }
        });

        // Add components to frame
        frame.add(label1);
        frame.add(label2);
        frame.add(resultLabel);
        frame.add(leftButton);
        frame.add(rightButton);
        frame.add(checkButton);

        // Show frame
        frame.setVisible(true);
    }
}

