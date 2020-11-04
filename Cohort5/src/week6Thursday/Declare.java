package week6Thursday;

// This example demonstrates 3 different ways to declare objects
public class Declare {
	int a;
	public Declare(int a) {
		this.a = a;
	}
	public static void main(String[] args) {
		// 1st way to create object, assigning reference to object
		
		Declare reference1 = new Declare(1);
		
		// 2nd way to create an object, creating multiple object in single statement
		
		Declare reference2 = new Declare(9), reference3 = new Declare(10),
				reference4 = new Declare(100);
		
		// 3rd way to create object, Anonymous Object (no reference)
		new Declare(100);
		
		new Declare(10).method();

	}

	void method(){
		System.out.println("We declared lots of objects");
	}
}
