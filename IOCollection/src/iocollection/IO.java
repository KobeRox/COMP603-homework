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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Xu
 */
public class IO {
    public static void main(String[] args) throws FileNotFoundException, IOException {
         BufferedReader br = new BufferedReader(new FileReader("scores.txt"));
        Map<String, Integer> myMap = new HashMap();
        List<String> names = new ArrayList<>();
        List <Integer>scores  = new ArrayList<>();
        String s   = null;
        while((s = br.readLine())!=null){
            String[] str = s.split("\\s+");
            myMap.put(str[0], Integer.valueOf(str[1]));
        }
        
        Set keySet=myMap.keySet();

        for(Map.Entry<String,Integer> sco:myMap.entrySet()){
            System.out.println(sco.getKey()+" "+sco.getValue());
        }
        
    }
}
