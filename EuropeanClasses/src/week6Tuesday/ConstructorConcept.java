package week6Tuesday;


class Class1{
	int a;
	double b;
	// Create a constructor
	// Constructor is a special method which we use in order to initialize objects
	// Constructors always have same name with classes
	// Constructor is running automatically whenever I create a new object
	public Class1(int a, double b) {
		System.out.println("2 parameter constructor");
		this.a = a;
		this.b = b;
	}
	// Overloading a constructor
	public Class1() {
		System.out.println("No parameter constructor");
		this.a = 1;
		this.b = 1;
	}
	// Overloading Constructors
	public Class1(int a) {
		System.out.println("One parameter constructor");
		this.a = a;
	}
}

public class ConstructorConcept {

	public static void main(String[] args) {
		Class1 ref = new Class1(99 , 9.7);
		Class1 ref2 = new Class1(4299, 42.98);
		Class1 ref3 = new Class1();
		Class1 ref4 = new Class1(9);
		
		Class2 ref5 = new Class2();
		
	}

}

class Class2{
	// JAva provides a default no parameter constructor, but we don't see it. 
	
}
