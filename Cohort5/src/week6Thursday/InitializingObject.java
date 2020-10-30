package week6Thursday;

// This example demonstrates 3 ways to initialize objects
//1) With method, 
//2) directly accessing the fields
//3) Constructors

public class InitializingObject {
	String aString;
	int aInt;
	
	// create a method which will initialize object fields
	void method(String a, int b){
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
		InitializingObject object1 = new InitializingObject();
		
		object1.method("Java", 8);

		System.out.println(object1.aString);
		System.out.println(object1.aInt);
		
		InitializingObject object2 = new InitializingObject();
		object2.aInt= 3;
		object2.aString = "Python";
		
		System.out.println(object2.aString);
		System.out.println(object2.aInt);
		
		InitializingObject object3 = new InitializingObject("Selenium", 4);
		
		
	}
	
}
