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
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Xu
 */
public class FileIO {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader read = new BufferedReader(new FileReader("scores.txt"));
        PrintWriter outputStream = new PrintWriter(new FileOutputStream("scores.txt",true));
        
        String line = null;
        while((line=read.readLine())!=null){
            String regEx="[^0-9]";  
            Pattern p = Pattern.compile(regEx);  
            Matcher m = p.matcher(line);  
            outputStream.println();
            outputStream.print( m.replaceAll(""));
        }
        outputStream.flush();

    }
}
