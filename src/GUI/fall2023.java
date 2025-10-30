package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class fall2023 implements ActionListener {
    JFrame frame;
    JButton b1,b2,b3,b4;
    JLabel l1,l2,l3,l4;
    JTextField t1,t2,t3,t4;

    fall2023() {
        frame = new JFrame();
        frame.setSize(800,400);
        frame.setLayout(new FlowLayout());
        l1=new JLabel("Num1");
        t1=new JTextField(5);

        l2=new JLabel("Num2");
        t2=new JTextField(5);

        l3=new JLabel("Num3");
        t3=new JTextField(5);

        l4=new JLabel("found");
        t4=new JTextField(5);

        b1=new JButton("Maximum");
        b1.addActionListener(this);
      b2=new JButton("Minimum");
      b2.addActionListener(this);
        b3=new JButton("Average");
        b3.addActionListener(this);
        b4=new JButton("clear");
        b4.addActionListener(this);


        frame.add(l1);
        frame.add(t1);

        frame.add(l2);
        frame.add(t2);

        frame.add(l3);

        frame.add(t3);

        frame.add(l4);
        frame.add(t4);

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);


        frame.setVisible(true);


    }
    public static void main(String[] args) {
        new fall2023();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str = t1.getText();
        String str2 = t2.getText();
        String str3 = t3.getText();
        int num1 = Integer.parseInt(str);
        int num2 = Integer.parseInt(str2);
        int num3 = Integer.parseInt(str3);
       if(e.getSource()==b1) {


           if (num1 > num2 && num1 > num3) {
               t4.setText(String.valueOf(num1));
           } else if (num2 > num1 && num2 > num3) {
               t4.setText(String.valueOf(num2));

           } else {
               t4.setText(String.valueOf(num3));
           }
       }
       if(e.getSource()==b2) {
           int min=Math.min(num1,Math.min(num2,num3));
           t4.setText(String.valueOf(min));

       }
        if(e.getSource()==b3) {
            int avg=(num1+num2+num3)/3;
            t4.setText(String.valueOf(avg));
        }
        if(e.getSource()==b4) {

            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            return;


        }
    }
}
