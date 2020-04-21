package abstractConcept;


// Abstract classes are part of Abstraction concept in OOP
// We will achieve abstraction by using abstract methods
// In order to create abstract methods, our class should be abstract class
// Ideas will be abstract methods, actual calculation will be implemented methods

abstract class Shape{
	/*
	 *  All shapes needs to have area, 
	 *  but shapes have their own way to calculate areas
	 *  Abstract methods needs to be implemented in implementer classes
	 *  unless implementer class is another abstract class
	 */
	abstract float area();
	
}

class Square extends Shape{
	int side;
	
	public Square(int side) {
		this.side = side;
	}


	@Override
	float area() {
		
		return side * side; // or Math.pow(side,2)
	}
	
}



class Circle extends Shape{
	
	int radius;
	static double pi = Math.PI;
	
	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	float area() {
		return (float) (pi*Math.pow(radius, 2));
	}
	
}
class Rectangle extends Shape{
	
	int width;
	int length;
	public Rectangle(int w, int l) {
		width = w;
		length = l;
	}
	
	@Override
	float area() {
		int area = width * length;
		return area;
	}
	
}


public class AbstractConcept {

	public static void main(String[] args) {
		Square square = new Square(9);
		Circle circle = new Circle(5);
		Rectangle rectangle = new Rectangle(6, 9);
		
		System.out.println("Square area : "+square.area());
		System.out.println("Circle area : "+circle.area());
		System.out.println("Rectangle area : "+rectangle.area());

	}

}
