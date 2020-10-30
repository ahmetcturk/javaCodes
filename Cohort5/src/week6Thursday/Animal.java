package week6Thursday;

// Overloading constructors
public class Animal {
	String type;
	int legs;
	
	public Animal() {
		System.out.println("This is no parameter constructor");
	}
	
	public Animal(String type) {
		this.type = type;
	}
	
	public Animal(int legs) {
		this.legs = legs;
	}
	
	public Animal(String type, int legs) {
		this.type = type;
		this.legs = legs;
	}
	
	void show(){
		System.out.println("Type : " 
	+ type + "\nlegs : " + legs);
		System.out.println("**************");
	}
	
}

