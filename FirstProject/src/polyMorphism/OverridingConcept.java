package polyMorphism;

// This example will demonstrate Overriding concept in polymorphism

public class OverridingConcept {
		
	public static void main(String[] args) {
		// Welcome Silicone Lab's Brilliant Students
		// Code Hard, Study Hard !
		Rectangle rectangle = new Rectangle();
		Square square = new Square();
		Circle circle = new Circle();
		
		rectangle.length = 5;
		rectangle.width = 6;
		rectangle.area();
		
		square.side = 10;
		square.area();
		
		circle.radius = 9;
		circle.area();
	}

}

//Shape class has area method. 
//In order to find the area, we need to use different formula for different shapes
//That's why, we need to override the area method in subclasses.
// In order to override methods, class needs to be in inheritance relation.
class Shape{
	void area(){
		System.out.println("*******************");
		System.out.println("Finding the area...");
		System.out.println("*******************");
	}
}

class Rectangle extends Shape{
	int width;
	int length;
	@Override
	void area() {
		super.area(); // this statement will call area method in the super class
		System.out.println("Rectangle area : width * length" + "\nArea is : " + width*length);
	}
}

class Square extends Shape{
	int side;
	@Override
	void area() {
		super.area();
		System.out.println("Square area : side * side" + "\nArea is : " + side*side);
	}
}

class Circle extends Shape{
	int radius;
	@Override
	void area() {
		super.area();
		System.out.println("Circle area : radius * radius * PI" + "\nArea is : " + (Math.pow(radius, 2) * Math.PI));
	}
}



