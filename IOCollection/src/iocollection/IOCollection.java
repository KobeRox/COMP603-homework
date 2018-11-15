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
import java.util.StringTokenizer;

/**   C:\Users\Xu\Documents\NetBeansProjects\IOCollection\src\iocollection\IOCollection.java
 *
 * @author Xu
 */
public class IOCollection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException 
    {
        BufferedReader read = new BufferedReader(new FileReader("input.txt"));
        
        PrintWriter outputStream;
        FileOutputStream fos=new FileOutputStream("output.txt");
        outputStream = new PrintWriter(fos);
        
        String line = null;
        String s = "";
        
        while((line = read.readLine())!=null)
        {
//           *** Character.isLetter(0)
            StringTokenizer st = new StringTokenizer(line, "+*_-[0-9]");
            while(st.hasMoreTokens())
            {
                s+=st.nextToken();
            }
            outputStream.println(new StringBuilder(s).reverse().toString().toUpperCase());
            
//            System.out.println(new StringBuilder(s).reverse().toString().toUpperCase());
            s = "";
        }
        
        outputStream.flush();
    }
}
