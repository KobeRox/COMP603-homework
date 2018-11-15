/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3d4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Xu
 */
public class nnn {
    public static void main(String[] args) {
        try { 
            FileReader fr = new FileReader("abc.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(nnn.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
}
