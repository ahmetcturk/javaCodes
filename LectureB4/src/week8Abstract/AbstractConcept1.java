package week8Abstract;

import javax.swing.plaf.synth.SynthScrollBarUI;

// Abstract Classes
abstract class SuperClass{
	int a;
	// 1 ) We can create method without body (with abstract keyword) 
	// 2) We cannot instantiate abstract classes
	// 3) Abstract classes can have 0 or more abstract methods
	// 4) Abstract classes can have concrete methods
	// 
	// abstract method
	
	abstract void add();
	abstract void display();
	
	void concreteMethod(){
		System.out.println("Concrete Method");
	}
	
	// Abstract classes can have constructors
	public SuperClass() {
		
	}
	
}

abstract class Subclass extends SuperClass{ 
	// We need to override abstract methods in the superclass
	
//	void add(){
//		System.out.println("Subclass overriden add()");
//	}
//
//	@Override
//	void display() {	
//		System.out.println("Subclass overriden display()");
//	}
}

// Concrete Classes
public class AbstractConcept1{
	
	
	// concrete method
	public static void main(String[] args)      {
		System.out.println("Hello");
		
		
		}
	
	

}
