package day8.abstraction;

public class Shape {
 protected float area;
     
     //abstract method 
	 void calArea() {
	}
	 
	 //concrete method
	 void show()
	 {
		 System.out.println("Area of shape is "+area);
	 }
}
