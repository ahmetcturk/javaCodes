package week6;

// This example demonstrates 3 ways to initialize objects
// With method, directly accessing the fields and constructors

// When we create a constructor, default constructor would be no longer valid
public class InitializingObject {

	String aString;
	int aInt;
	
	void method(String a , int b){
		aString = a;
		aInt = b;
	}
	
	public InitializingObject(String aString, int aInt) {
		this.aString = aString;
		this.aInt = aInt;
	}
	public InitializingObject() {
		
	}

	public static void main(String[] args) {
		
		// Initializing the object with using a method
		InitializingObject object1 = new InitializingObject();
		object1.method("Java", 8);

		System.out.println(object1.aString + " " + object1.aInt);
		// Initializing the object with using a constructor
		InitializingObject object2 = new InitializingObject("Java", 11);
		
		// Initializing the object with directly accessing the fields
		InitializingObject object3 = new InitializingObject();
		object3.aString = "Java";
		object3.aInt = 12;
	}

}
