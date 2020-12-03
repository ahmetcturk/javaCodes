package week8Thursday;

// Abstract Class
abstract class SuperClass{
	int a;
	// 1) We can create method without body (abstract method)
	// 2) We can not instantiate(create object) abstract classes
	// 3) Abstract classes can have 0 or more abstract methods
	// 4) Abstract classes can have constructors or concrete methods
	// abstract method
	abstract void add();
	abstract void display();
	
	 void concreteMethod(){
		System.out.println("Concrete method");
	}
	
	public SuperClass() {
		
	}
	
}

class Subclass extends SuperClass{
	// We need to override all abstract methods in the superclass if subclass is concrete class
	// If subclass is abstract class, we don't need to override abstract methods in superclass
	@Override
	void add() {
		System.out.println("Subclass overriden the add() method");
		
		
	}

	@Override
	void display() {
		System.out.println("Subclass overriden the display() method");
		
	}
	
	
	
}



// concrete classes
public class AbstactClassConcept1 {

	
	
	// Concrete method
	public static void main(String[] args)    {
		System.out.println("Hello World");
		
		}

}
