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
public class Rectangle extends Shape {
    
    public double x, y;

    
    public Rectangle(double x, double y) {
        super("Rectangle");
        this.x = x;
        this.y = y;
    }
    
    public Rectangle(double x){
        super("Square");
        this.x = x;
        this.y = x;
        
    }

    @Override
    public void calculateArea() {
        this.area = x*y;
    }
    
}
