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
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Xu
 */
public class Lst {
    public static void main(String[] args) {
        Map<String, Integer>records  = readRecords();
        System.out.println(records);
        Scanner scanner = new Scanner(System.in);
        String name = null;
        Integer score = null;
        while(true){
            System.out.println("Enter ur name ");
            //ensure everytime use x to exit 
            name = parseInput(scanner, records);
            boolean validation = false;
            while(!validation){
                System.out.println("Enter ur mark ");
//                score = parseInput(scanner, Integer.valueOf(records));
                score = Integer.parseInt(parseInput(scanner, records));
                validation = true;
            }
            
            if(records.containsKey(name)){
                System.out.println("Name "+name+" already exists "+records.get(name)+"\nY to save, N not to save");
                if(parseInput(scanner, records).trim().equalsIgnoreCase("Y")){
                    records.put(name, score);
                }
            }
            else{
                records.put(name, score);
                System.out.println("Info has been added ");
            }
            System.out.println(records);
            
        }
        
    }
    
    
    public static String parseInput(Scanner scanner,Map<String,Integer>records){
        String input = scanner.nextLine();
        if(input.trim().equalsIgnoreCase("X")){
            //use save to file method 
            saveToFile(records);
            System.out.println("File saved successfully");
            System.exit(0);
        }
        return input;
    }
    
    public static void saveToFile(Map<String,Integer>records){
        PrintWriter pw = null;
        try {
            pw = new PrintWriter("scores.txt");
            for (Map.Entry<String, Integer> entry : records.entrySet()) {
                pw.println(entry.getKey()+" "+entry.getValue());
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lst.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if(pw!=null){
                pw.close();
            }
        }
    }
    
    public static Map<String,Integer> readRecords(){
        Map<String, Integer>records = new HashMap<>();
        BufferedReader br = null;
        
        try {
            br = new BufferedReader(new FileReader("scores.txt"));
            String line = null;
            while((line = br.readLine())!= null){
                String[] record = line.split(" ");
                records.put(record[0], Integer.valueOf(record[1]));
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lst.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lst.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(br != null){
                try {
                    br.close();
                } catch (IOException ex) {
                    Logger.getLogger(Lst.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return records;
    }
}
