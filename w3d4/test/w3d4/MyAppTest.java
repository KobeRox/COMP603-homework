/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3d4;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Xu
 */
public class MyAppTest {
    
    public MyAppTest() {
    }

    /**
     * Test of main method, of class MyApp.
     */
    //@Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MyApp.main(args);
        // TODO review the generated test code and remove the default call to fail.
        ////fail("The test case is a prototype.");
    }

    /**
     * Test of countOdd method, of class MyApp.
     */
    @Test
    public void testCountOdd() {
        System.out.println("countOdd");
        int[] number = {1,2,3,4,5,10,18};
        MyApp instance = new MyApp();
        int expResult = 3;
        int result = instance.countOdd(number);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
