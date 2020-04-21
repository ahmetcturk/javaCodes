package thirdPackage;

//We will find how many object has been created from the Declare class
// Everytime we create an object, one constructor will be invoked
// If we put static int to the constructors, we can count the number of object

class Declare {
	 static int count = 0;
	void method() {
		System.out.println("Method in Declare class");
	}
	public Declare() {
		count++;
	}

}

public class StaticConcept2 {
	public static void main(String[] args) {
		// Welcome Silicone Lab's Brilliant Students
		// Code Hard, Study Hard !
		
		Declare object1 = new Declare(); 

		new Declare();
		new Declare().method();

		
		Declare object2 = new Declare(), object3 = new Declare(), object4 = new Declare();

		System.out.println(object1.count);
	}

}
