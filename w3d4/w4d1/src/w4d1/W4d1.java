/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w4d1;

import java.awt.BorderLayout;
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
public class W4d1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JFrame frame = new JFrame();
       frame.setTitle("FrameTest-1");
       frame.setSize(400, 500);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       JPanel jpa = new JPanel();
       frame.add(jpa);
       jpa.setLayout(new BorderLayout(10,5));
       
       JButton b1 = new JButton("First Button");
       JButton b2 = new JButton("Second Button");
       JButton b3 = new JButton("third Button");
       jpa.add(b1,BorderLayout.WEST);
       jpa.add(b2, BorderLayout.EAST);
       jpa.add(b3,BorderLayout.SOUTH);
       
       JTextArea jtx = new JTextArea();
       jtx.setLineWrap(true);
       jpa.add(jtx,BorderLayout.CENTER);
       
       b1.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               jtx.setText(jtx.getText()+"\n"+"Hello world! ");
               //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }
       });
       b2.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               jtx.setText(jtx.getText()+"\n"+"invaluable! ");
               //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }
       });
       
       frame.setVisible(true);
       //frame , revelent panel, relation 
    }
    
}
