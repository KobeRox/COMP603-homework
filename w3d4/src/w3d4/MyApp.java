/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3d4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Xu
 */
public class MyApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 0;
        while (true) {
            try {
                n = s.nextInt();
                break;
            } catch (InputMismatchException e) {
                s.nextLine();
                System.out.println("plz enter an integer! ");
                // e.printStackTrace();
            }
        }
        
        s.nextLine();
        String[] strings = new String[n];

        for (int i = 0; i < strings.length; i++) {
            System.out.println("plz enter the " + (1 + i) + "th sentence . ");

            strings[i] = s.nextLine();

        }
        System.out.println("plz select a line to print : ");
        while (true) {
            try {
                System.out.println(strings[s.nextInt()-1]);
                break;
            } catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
                System.out.println("plz enter integer from 0 -> " + n);
            }

        }
    }
    
    public int countOdd(int[] number){
        int count=0;
        for (int i = 0; i < number.length; i++) {
            if(number[i] % 2 == 1){
                count++;
            }
            
        }
        return count;
    }
}
