package week7Thursday;



class Shape{
	void findArea(){
		System.out.println("********");
		System.out.println("Finding the area");
		System.out.println("********");
	}
}
class Square extends Shape{
	int side;
	// Super keyword acts like superclass object
	void findArea(){
		super.findArea();
		System.out.println("Square Area is : " + side*side);
	}
}
class Circle extends Shape{
	int radius;
	void findArea(){
		super.findArea();
		System.out.println("Circle Area is : " +radius*radius*Math.PI);
	}
}
class Rectangle extends Shape{
	int width;
	int length; 
	void findArea(){
		super.findArea();
		System.out.println("Rectangle area is : " + width * length);
		
	}
}

public class OverrigingConcept {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.length = 90;
		rectangle.width = 9;
		rectangle.findArea();
		
		
		Square square = new Square();
		square.side = 9;
		square.findArea();
		
		Circle circle = new Circle();
		circle.radius = 7;
		circle.findArea();
	}

}
