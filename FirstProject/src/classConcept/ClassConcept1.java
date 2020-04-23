package classConcept;

//There can be only one public class per source file.
//A source file can have multiple non-public classes.

class myClass{
	// Classes have fields - methods - constructors as members
	
	// Fields - Global Variables - attributes
	int x;
	String y;
	 
	// Constructor is a special blocks which has same name with class
	// We are using constructor in order to initialize the object
	// Even if you don't declare constructor, java creates a default one (non-parameter)
	public myClass(int x, String y) {
		System.out.println("Two parameter constructor has been used");
		this.x = x;
		this.y = y;
	}
	
	public myClass() {
		System.out.println("No parameter constructor has been used");
	}
	
}

public class ClassConcept1 {

	public static void main(String[] args) {
		// Object for myClass class
		myClass myObject = new myClass(10,"Java"); // we are using 2 parameter constructor
		System.out.println("These datas has been initialized by constructor -----> " +
		myObject.x + " " + myObject.y);
		
		// Object 2 for myClass Class
		myClass myObject2 = new myClass(); // We are using no parameter constructor
		myObject2.x = 12;
		myObject2.y = "Giant Men";
		System.out.println("These datas has been initialized by reference -----> " +
				myObject2.x + " " + myObject2.y);
		
	}

}





