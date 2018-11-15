/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapecalculator;

/**
 *
 * @author Xu
 */
public class Circle  extends Shape{
    
    public double rad;
    final double pi = Math.PI;   

    
    
        
    public Circle(double r){
        super("Circle");
        this.rad = r;
    }

    
    public void calculateArea() {
        this.area = rad*rad*pi;  
    }

    
    
}
