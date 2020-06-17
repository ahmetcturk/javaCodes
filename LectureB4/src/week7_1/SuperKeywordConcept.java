package week7_1;

class Parentclass {
	Parentclass() {
		System.out.println("Constructor of Superclass");
	}
}

class Subclass extends Parentclass {
	Subclass() {
		/*
		 * Compile adds super() here at the first line of this constructor
		 * implicitly
		 */
		System.out.println("Constructor of Subclass");
	}

	Subclass(int n1) {
		/*
		 * Compile adds super() here at the first line of this constructor
		 * implicitly
		 */
		System.out.println("Constructor with arg");
	}

	void display() {
		System.out.println("Hello");
	}

}

public class SuperKeywordConcept {

	public static void main(String args[]) {
		// Creating object using default constructor
		Subclass obj = new Subclass();
		// Calling sub class method
		obj.display();
		// Creating object 2 using arg constructor
		Subclass obj2 = new Subclass(10);
		obj2.display();
	}
}
