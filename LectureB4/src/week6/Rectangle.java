package week6;

public class Rectangle {
	
	// attributes
	int length;
	int width;
	
	// methods
	void calculateArea(){
		System.out.println("Area of the rectangle is : " + length * width);
	}
	
	void calculatePerimeter(){
		System.out.println("Perimeter of the rectangle is : " + (2*(length + width)));
	}
	
	
	public static void main(String[] args) {
		Rectangle object1 = new Rectangle();
		object1.length = 5;
		object1.width = 10;
		object1.calculateArea();
		object1.calculatePerimeter();
		// Task : Create an object 2, calculate area and perimeter of the objects

	}

}
