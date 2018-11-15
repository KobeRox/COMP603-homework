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
public class Square extends Rectangle{
    
    public double side;
    public Square(double sq){
        super(sq, sq);
        this.setName("Square");
        this.side = sq;
        
    }
    public void calculateArea(){
        this.area = side*side;
    }
    
}
