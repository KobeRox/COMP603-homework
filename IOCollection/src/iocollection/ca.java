/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iocollection;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.time.Clock.system;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Xu
 */
public class ca {
    public static void main(String[] args) {
        Map<String,Integer> records = readFile();
        System.out.println(records);
        Scanner scanner = new Scanner(System.in);
        String name = null;
        Integer score = null;
        while(true){
            System.out.println("Please enter a name");
            name=parseInput(scanner, records);
            boolean validScoreInput = false;
            
            while(!validScoreInput){
                try{
                    System.out.println("Please enter a score");
                    score = Integer.parseInt(parseInput(scanner, records));
                    validScoreInput = true;
                } catch(NumberFormatException e){
                    System.out.println("Please enter an integer as score.");
                }
            }
            
            
            if(records.containsKey(name)){
                System.out.println("The name "+name+" with old score is "+records.get(name)+". Enter y to update the score");
                String confirmation = parseInput(scanner, records);
                if(confirmation.trim().equalsIgnoreCase("y")){
                    records.put(name, score);
                }
            } else{
                records.put(name, score);
                System.out.println("The score is added");
            }
            System.out.println(records);
        }
            
            
            
            
            
            
            
            
            
//            try {
//            BufferedReader br = new BufferedReader(new FileReader("scores.txt"));
//            PrintWriter pw = new PrintWriter(new FileOutputStream("scores.txt"));
//
//            System.out.println("Enter your name");
//            Scanner sc = new Scanner(System.in);
//            String scN = sc.nextLine();
//            System.out.println("Enter your marks");
//            int scM = sc.nextInt();
//            if (records.containsKey(scN)) {
//                System.out.println("Same Name " + scN + " already exist , [Y/N] to update ur new score");
//                String yn = sc.next();
//
//                if (yn.equalsIgnoreCase("Y")) {
//                    records.replace(scN, scM);
//                    
//
//                } else if (yn.equalsIgnoreCase("N")) {
//                    System.out.println("Not saved the new changes");
//                }
//            } else {
//                records.put(scN, scM);
//                System.out.println("new records added");
//            }
//
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(ca.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(ca.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//            
        }
        
    


    public static String parseInput(Scanner scanner,Map<String,Integer> records){
        String input = scanner.nextLine();
        if(input.trim().equalsIgnoreCase("X")){
            writeToFile(records);
            System.out.println("File saved.");
            System.exit(0);
        }
        return input;
    }
    
    public static void writeToFile(Map<String,Integer> records){
        PrintWriter pw = null;
        try {
            pw = new PrintWriter("scores.txt");
            for(Map.Entry<String,Integer> recordEntry: records.entrySet()){
                pw.println(recordEntry.getKey()+" "+recordEntry.getValue());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Task2.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            if (pw != null){
                pw.close();
            }
        }
    }
    
    public static Map<String,Integer> readFile(){
        Map<String, Integer> record = new HashMap<>();
        BufferedReader br ;
        String s = null;
        try {
            br = new BufferedReader(new FileReader("scores.txt"));
            while((s = br.readLine())!= null){
                String[] str = s.split(" ");
                record.put(str[0],Integer.valueOf(str[1]));
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ca.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ca.class.getName()).log(Level.SEVERE, null, ex);
        }
        return record;
    }
    
}
