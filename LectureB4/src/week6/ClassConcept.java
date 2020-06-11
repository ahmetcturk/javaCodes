package week6;

// This example demonstrates using different constructors while instantiating object
public class ClassConcept {

	// fields
	int number;
	String word;
	
	// Constructors
	
	public ClassConcept(int number, String word) {
		
		this.number = number;
		this.word = word;
		System.out.println("You used 2 parameter constructor");
		
	}
	
	public ClassConcept() {
		System.out.println("You used no parameter constructor");
	}
	
	// methods
	
	
	public static void main(String[] args) {
		
		ClassConcept object1 = new ClassConcept(1, "Hello");// we used 2 parameter const.
		ClassConcept object2 = new ClassConcept();// we used no parameter const.
		System.out.print("Previous : ");
	     System.out.println(System.getProperty("java.runtime.version" ));
	}

	

}
