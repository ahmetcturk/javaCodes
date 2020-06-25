package week8Abstract;

import javax.print.attribute.standard.Sides;

abstract class Shape{
	abstract float area();
}

class Square extends Shape{
	
	int side;
	
	public Square(int side) {
		this.side = side;
	}	
	@Override
	float area() {
		return side*side;
	}
	
}

class Circle extends Shape{
	int radius;
	static final double pi = Math.PI;
	
	 public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	float area() {
		return  (float) (radius*radius*pi);
	}
}

public class AbstractConcept2 {

	public static void main(String[] args) {
	//  Upcasting
	//  SupClass		  SubClass object
		Shape shape = new Circle(9);
	//        refName	
		System.out.println(shape.area());
		
		shape = new Square(9);
		
		System.out.println(shape.area());
		
		
		
	}

}
