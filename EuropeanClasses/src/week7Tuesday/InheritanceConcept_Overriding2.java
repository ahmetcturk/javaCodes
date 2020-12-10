package week7Tuesday;


class Shape{
	void findArea(){
		System.out.println("Finding Area");
	}
}
class Rectangle extends Shape{
	void method(){ // this - super
		this.findArea(); // this acting like current classes reference
		super.findArea();// super acting like super class reference
	}
	void findArea(){
		System.out.println("Finding Area of Rectangle");
	}
}
class Circle extends Shape{
	
	void findArea(){
		System.out.println("Finding Area of Circle");
	}
}
public class InheritanceConcept_Overriding2 {

	public static void main(String[] args) {
		Circle circle = new Circle();
		Rectangle rectangle = new Rectangle();
		Shape shape = new Shape();
		
		circle.findArea();
		rectangle.findArea();
		shape.findArea();
		new Rectangle().method();
	}

}
