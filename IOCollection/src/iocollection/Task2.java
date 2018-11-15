/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iocollection;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *C:\Users\Xu\Documents\NetBeansProjects\IOCollection\src\iocollection\Task2.java
 * @author yyang
 */
public class Task2 {
    
    public static void main(String[] args) {
        Map<String,Integer> records = readRecords();
        System.out.println(records);
    }
    
    public static Map<String,Integer> readRecords(){
        Map<String,Integer> records = new HashMap<>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("scores.txt"));
            String line;
            while((line = br.readLine())!= null){
                String[] splitString = line.split(" ");
                records.put(splitString[0], Integer.valueOf(splitString[1]));
            }
        }  catch (IOException ex) {
            Logger.getLogger(Task2.class.getName()).log(Level.SEVERE, null, ex);
        }
        return records;
    }
}
