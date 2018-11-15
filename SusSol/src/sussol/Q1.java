
package sussol;

import java.util.ArrayList;

/**
 *
 * @author Kobe Xu
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    
    static ArrayList<Integer>list = new ArrayList<>();

    public static void main(String[] args) {
        //give a number range
        KapNum(250, 5000);
        System.out.println("Kaprekar numbers :");
        System.out.println(list.toString());
    }
    
    
    public static ArrayList<Integer> KapNum(int numStart, int numEnd) {
        for (int n = numStart; n < numEnd; n++) {
            long num = (long) Math.pow(n, 2);
            long curNum = n;
            long count = 0;
            while(curNum!= 0){
                curNum = curNum/10;
                count++;
            }
            long l = (long) (num/Math.pow(10, count));
            long r = (long) (num%Math.pow(10, count));
            if(r+l==n){
                list.add(n);
            }
        }
        return list;
    }
}


//Kaprekar numbers :
//[297, 703, 999, 2223, 2728, 4950]