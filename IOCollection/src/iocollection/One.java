/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
//C:\Users\Xu\Documents\NetBeansProjects\IOCollection\src\iocollection\One.java
 */
package iocollection;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Xu
 */
public class One {
    public static void main(String[] args) {
        BufferedReader br = null;
        List<String>splitNames = new ArrayList<>();
        List<Integer>splitScores = new ArrayList<>();
        try {
             br = new BufferedReader(new FileReader("scores.txt"));
//            PrintWriter pw = new PrintWriter(new FileOutputStream("scores.txt"),true);
            String s = null;
            
            
            int n = 0;

            while((s = br.readLine()) != null){
                String[] str = s.split(" ");
                splitNames.add(str[0]);
                splitScores.add(Integer.valueOf(str[1]));
                System.out.print(splitNames.get(n));
                System.out.print(" "+splitScores.get(n) + "   ");
                n++;
            }
            System.out.println();
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(One.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(One.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
//            System.out.println(splitNames);
//            System.out.println(splitScores);
    }
    
}
