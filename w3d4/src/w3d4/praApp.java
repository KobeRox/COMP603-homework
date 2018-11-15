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
public class praApp {
    public static void main(String[] args) {
//        int[]teg = new int[4];
//        int[]integ = {1,2,3,4,5};
//        

        
        Scanner in = new Scanner(System.in);
        boolean con = true;
        int num = 0;
        while(con){
            try {
                num = in.nextInt();
                con = false;
            } catch (InputMismatchException e) {
                in.nextLine();
                System.out.println("enter invalid ");
            }
        }
        in.nextLine();
        String[]strings = new String[num];
        for (int i = 0; i < num; i++) {
            System.out.println("enter the "+(i+1)+"th sentence ");
            String s = in.nextLine();
            strings[i]= s;
        }
        
    }
}
