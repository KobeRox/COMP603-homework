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
public abstract class Shape {
        public String shapeName="";
    	public double area=0;
	public Shape(String name){
		this.shapeName=name;
	}


        public void printInfo(){
            System.out.println(this.shapeName);
			//this.calculateArea();
            System.out.println(this.area);
        }

        public void setName(String newName){
            this.shapeName=newName;
        }
        public abstract void calculateArea();

}