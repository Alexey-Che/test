package com.company.task5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ForKoza implements ActionListener {
    JTextField text;

    public ForKoza(JTextField text)   {
        this.text= text;
    }

    public void actionPerformed(ActionEvent event)  {

        text.setText("Таня коза");


    }
}


