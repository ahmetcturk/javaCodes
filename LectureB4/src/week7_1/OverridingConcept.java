package week7_1;
// Overriding : Overriding provide us specific implementation for methods in subclass classes and super classes
// Final, static, private methods can not be overriden 
// Overriden methods must have the same return type
/*
 *  Difference between overloading and overriding
 *  Overloading : methods will have different method signature, methods have to be in same class
 *  Overriding : methods will have same method signature, methods have to be in different classes 
 *  
 */
class Shape{
	void findArea(){
		System.out.println("******************");
		System.out.println("Finding the area");
		System.out.println("******************");
	}
	 // Constructor can not be final
	
}

class Square extends Shape{
	int side;
	void findArea(){
		super.findArea();
		System.out.println("Area of the square is : " + side*side);
	}
}

class Circle extends Shape{
	int radius;
	double pi = Math.PI;
	
	void findArea(){
		super.findArea();
		System.out.println("Area of the circle is : " + (int)(pi*Math.pow(radius, 2)));
	}
	
}

public class OverridingConcept {

	public static void main(String[] args) {
		Square square1 = new Square();
		square1.side = 8;
		square1.findArea();
		Circle circle1 = new Circle();
		circle1.radius = 10;
		circle1.findArea();
		
		Rectangle rectangle1 = new Rectangle();
		rectangle1.width = 10;
		rectangle1.length = 9;
		rectangle1.findArea();
		
	}

}

class Rectangle extends Shape{
	int width;
	int length;
	// in order to call it overriding, methods needs to be inherited
	void findArea(){ // Overriding the findArea Method
		super.findArea(); // super keyword acts as reference for superclass object
		System.out.println("Rectangle area is : " +"width * length : "+ width*length);
	}
}
