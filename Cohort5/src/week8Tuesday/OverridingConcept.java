package week8Tuesday;
// Overriding : Overriding provides specific implementation for methods in subclasses and superclasses
// Final, static, private methods can not be overriden

// Overriden method must have the same return type, same name, same parameter list
// Overriden method access modifier can not be more restrictive than super class method

class Shape{
	void findArea(){
		System.out.println("Finding the area..");
	}
	void findPerimeter(){
		System.out.println("Finding the perimeter");
	}
}

class Rectangle extends Shape{
	int width, length;
	void findArea(){
		System.out.println(width * length);
	}
	void findPerimeter(){
		System.out.println(2*(width + length));
	}
}
class Square extends Shape{
	int side;
	void findArea(){
		System.out.println(side * side);
	}
	void findPerimeter(){
		System.out.println(4*side);
	}
}

public class OverridingConcept {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.findArea();

	}

}
