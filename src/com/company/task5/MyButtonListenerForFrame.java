package com.company.task5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButtonListenerForFrame implements ActionListener {

    JFrame frame;

    public MyButtonListenerForFrame(JFrame frame)   {

        this.frame = frame;
    }
@Override
    public void actionPerformed(ActionEvent event)  {

        frame.repaint();
    }
}

