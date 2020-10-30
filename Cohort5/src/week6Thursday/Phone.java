package week6Thursday;


// This class demonstrates constructor concept
public class Phone {
	
	String brand;
	int price;
	// Constructors are special 
	// blocks which instantiate objects
	// You can insert everything 
	// you want to inside of a constructor
	// While creating object
	
	public Phone(String string, int integer) {
		
		brand = string;
		price = integer;
		System.out.println("Welcome, your object has been created");
	}
	
	public Phone() {
		System.out.println("This is no parameter const.");
		brand = "Unknown";
	}
	
}
