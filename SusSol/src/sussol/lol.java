/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sussol;

/**
 *
 * @author Xu
 */
public class lol {
    
    public static void main(String[] args) {
        Kap(1, 100);
    }
    
    public static int[] Kap(int kai, int end){
        for (int num = kai; num < end; num++) {
            long val=(long)Math.pow(num,2);
            long cnum=num, count=0;
            System.out.println(val);
            while(cnum!=0)
		{
			cnum=cnum/10;
			count++;
		}
		long i=(long)(val/Math.pow(10,count));
		long j=(long)(val%Math.pow(10,count));
		if(i+j==num)
		{
			System.out.println("num is "+num+"         It is a kaprekar number.");
		}
		else
		{
			System.out.println("num is "+num+"It is not a kaprekar number.");
		}
        }
        return null;
    }

}
