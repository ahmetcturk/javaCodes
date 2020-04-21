package secondPackage;

class Declare{
	void method(){
		System.out.println("Method in Declare class");
	}
	
}

public class CreatingObject {

	public static void main(String[] args) {
		// Welcome Silicone Lab's Brilliant Students
		// Code Hard, Study Hard !
		
		// Declaring objects in different ways
		
		// Creating object reference
		Declare object1 = new Declare(); // object1 is a reference for my object
		
		// Anonymous Objects, this is a good approach when we need to use our object only one time
		
		new Declare();
		new Declare().method();
		
		// Creating multiple object in one statement
		Declare object2 = new Declare(), object3 = new Declare(), object4= new Declare();
		
	}

}
