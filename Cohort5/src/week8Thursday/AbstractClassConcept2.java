package week8Thursday;

abstract class Shape{
	abstract  float findArea();
}

class Circle extends Shape{
	int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	
	@Override
	float findArea() {
		// TODO Auto-generated method stub
		return (float) (radius * radius * 3);
	}
	
}

class Square extends Shape{

	int side;
	public Square(int side) {
		this.side = side;
	}
	@Override
	float findArea() {
		// TODO Auto-generated method stub
		return side * side;
	}
}


public class AbstractClassConcept2 {

	public static void main(String[] args) {
		//    Upcasting
		//    refrence    // Object
		Shape reference = new Square(9);
		System.out.println(reference.findArea()); // 81
		
		reference = new Circle(5);
		System.out.println(reference.findArea());//
		
		
		//                 anonymous object
		System.out.println(new Square(15).findArea()); // 225

		

	}

}
