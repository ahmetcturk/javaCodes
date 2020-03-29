package week6;


public class Group2 {

// Do we have to create constructors  ? 
	// - There is a default constructor which has no parameter
// What is the difference between methods and constructors ? 
	// - Constructor name have to be same with the class name
	// - constructors doesn't have return type in method header and return keyword
// Does the fields has to be private in order to use constructors - getters &setters ? 
	// - No
	

	String name;
	int id;
// objects are instances(example) of the classes
	// Classes are blueprints of the objects
	public Group2(String name, int id) {// parameters : name,id
		this.name = name;
		this.id = id;
		System.out.println("I am using two parameter constructor");
		
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Group2 object = new Group2();
		object.name = "Ahmet";
		object.id = 4298;
		
		Group2 object2 = new Group2("Ahmet", 4298); // Instantiation
		Group2 object3 = new Group2("Ahmet"); // argument : Ahmet
		
	}

	public Group2() {
		System.out.println("I am using non parameter constructor");
	}

	public Group2(String name) {

		this.name = name;
		System.out.println("One parameter constructor has been triggered");
	}
	
	
	
	
	
}
