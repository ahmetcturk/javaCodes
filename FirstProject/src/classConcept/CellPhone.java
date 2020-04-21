package classConcept;


// This example demonstrates what are the members of the class
// Class consist of fields, methods and constructors
public class CellPhone {

	// Fields are the the variables that defines a class
	String manufactorer;
	String model;
	double retailPrice;
	
	// Methods are special functions which describes actions that class have
	
	void call(){
		System.out.println("Cellphone is ringing");
	}
	
	void showModel(){
		System.out.println(model);
	}
	
	double showPrice(){
		return retailPrice;
	}
	
	// Constructors are being used in order to initialize the objects
	public CellPhone() {
		// Everytime we create an object for the class, 
		// one of the constructors will be invoked
	}
	
	public void info(){
		System.out.println("Manufactorer : " + manufactorer+ "\nModel : "
				+model + "\nPrice : " + retailPrice);
	}
	
	
}
