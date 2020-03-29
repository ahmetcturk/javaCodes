package week6;

public class Initializing {

	private String name;
	private int id;
	
	public Initializing(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public Initializing() {
		// we are creating non-parameter constructor to be able to initialize the objects without using a parameter 
	}

	public static void main(String[] args) {
		// Different ways to initialize objects
		
		// Initialization trough reference
		Initializing object1 = new Initializing();// object1 = object reference
		object1.name = "Ahmet";
		object1.id = 4298;
		
		// initializing the object trough methods.
		Initializing object2 = new Initializing();
		object2.setName("Ahmet Can");
		object2.setId(4298);
		
		// Initializing trough constructors
		Initializing object3 = new Initializing("Ahmet Can Turk", 4298);
		
	}
	
// We only created setters, because we want to initialize the objects
	// if you want to see the object values, you can create getters
	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	

}
