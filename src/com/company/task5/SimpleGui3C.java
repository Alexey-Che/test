package com.company.task5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SimpleGui3C    {

    public void go()    {

        JTextField text = new JTextField();

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //MyButtonListenerForFrame buttonListener = new MyButtonListenerForFrame(frame);
        //ForKoza buttonListener1 = new ForKoza(text);

        JButton button = new JButton("Change colors");
        JButton button1 = new JButton("colors Change");

        text.setText("hello");
        button.addActionListener(new MyButtonListenerForFrame(frame));
        //button1.addActionListener(buttonListener1);
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text.setText("Таня коза");
            }
        } );


        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.NORTH, button1);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.getContentPane().add(BorderLayout.EAST, text);
        frame.setSize(900,900);
        frame.setVisible(true);
    }


}
