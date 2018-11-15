package shapecalculator;

import java.util.Scanner;

public class ShapeCalculator{
    public static void main(String[] args){
	
	Shape[] shapeArray = new Shape[3];
        
        shapeArray[0]=new Circle(2.0);
        shapeArray[1]=new Rectangle(2,5);
        shapeArray[2]=new Square(2);
        
        for(int i=0; i<3; i++)
        {
            shapeArray[i].calculateArea();
            shapeArray[i].printInfo();
        }    
        
	
		System.out.println(" PDC week4 lab \n Please Select: 1: Rectangle   2: Circle   3: Square");
		int option=0;
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		
		try {
			option= Integer.valueOf(s.trim()).intValue();
			if(option ==1){
				System.out.print("Input length: ");
				s=scan.nextLine();
				double len=Double.parseDouble(s);
				System.out.print("Input width: ");
				s=scan.nextLine();
				double wid=Double.parseDouble(s);
				
				Rectangle aRec=new Rectangle(len, wid);
				aRec.calculateArea();
				aRec.printInfo();
			}
			else if(option == 2){			
				System.out.print("Input radius: ");
				s=scan.nextLine();
				double rad=Double.parseDouble(s);
				
				Circle aCir=new Circle(rad);
				aCir.calculateArea();
				aCir.printInfo();
			}
			else if(option == 3){			
				System.out.print("Input side length: ");
				s=scan.nextLine();
				double slen=Double.parseDouble(s);
                                Square aSqu=new Square(slen);
				aSqu.calculateArea();
                                aSqu.setName("Square");
				aSqu.printInfo();
			}
			else {
				System.out.println("Wrong input.");
			}
			System.out.println("Thank you!");
			
		}
		catch (NumberFormatException e) {
			System.out.println("Invalid input. Not an integer");
		}
	}
}