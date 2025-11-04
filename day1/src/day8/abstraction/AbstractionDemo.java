package day8.abstraction;

public class AbstractionDemo {
	public static void main(String[] args) {
		Square sq=new Square();
		Rectangle r1=new Rectangle();
		sq.calArea();
		((Shape) sq).show();
		r1.calArea();
		((Shape) r1).show();
		
		System.out.println("------------------------------------------------");
		//Runtime Polymorphism / Dynamic binding / late binding
		//Ex: Method Overriding
		
		Object shape;
		shape=new Shape();
		
		((Shape) shape).calArea(); // invoked Square class calArea()
		((Shape) shape).show();
		
		shape=new Rectangle(10,20);
		
		((Shape) shape).calArea(); // invoked Rectangle class calArea()
		((Shape) shape).show();
		
	}

}
