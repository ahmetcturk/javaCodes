package week6a;

// This example demonstrates different ways to create object

public class Declare {

	
	
	public static void main(String[] args) {
		// 1st way to create object, assigning reference to an object
		
		Declare reference1 = new Declare();
		
		// 2nd way to create object, creating multiple objects in single statement
		Declare reference2 = new Declare(), reference3 = new Declare() , reference4 = new Declare();
		
		// 3rd way to create object, Anonymous object
		new Declare();

	}

}
