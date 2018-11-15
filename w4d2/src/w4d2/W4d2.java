/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w4d2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Xu
 */
public class W4d2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a frame
        JFrame frame = new JFrame();
        frame.setTitle("this is it");
        frame.setSize(600,400);
//        frame.setTitle("this is it");
        
        //create panels
        JPanel outerJPanel = new JPanel(new BorderLayout());
        frame.add(outerJPanel);
        
        //create a panel which contains buttons
        JPanel buttonJPanel = new JPanel(new FlowLayout());
        buttonJPanel.setBackground(Color.red);
        JButton okButton = new JButton("OK");
        JButton cancelButton = new JButton("Cancel");   
        
        buttonJPanel.add(okButton);
        buttonJPanel.add(cancelButton);
        
        outerJPanel.add(buttonJPanel,BorderLayout.SOUTH);
        
       
       JTextArea area = new JTextArea();
       outerJPanel.add(area,BorderLayout.CENTER);
       area.setBackground(Color.green);
       area.setSize(50,50);
       area.setForeground(Color.ORANGE);
       //font name "times"
       area.setFont(new Font("Times",Font.BOLD,30));
       area.setLineWrap(true);
       
       
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       //actionListener class
       okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                area.setText("hello + you");
                area.setText(area.getText()+"hello + hahaha  ");
            }
        });
       cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area.setText("");
            }
        });
       
       
       
       //new create a instance from class
       frame.setVisible(true);
        
       
        
    }
    
}
