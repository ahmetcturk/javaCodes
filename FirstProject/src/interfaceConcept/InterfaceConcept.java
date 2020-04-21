package interfaceConcept;

// We can reach to abstraction with interfaces
// We can reach multiInheritance with interfaces

interface Iinterface{
	void message(); // abstract method
}

class ClassB implements Iinterface{ // We need to implement abstract methods from interface

	@Override
	public void message() {
		
		System.out.println("Message from Class B");
		
	} 
	
}

public class InterfaceConcept {

	public static void main(String[] args) {
		// Interfaces can not be instantiated
		ClassB classB = new ClassB();
		classB.message(); // Message from Class B
		Iinterface object = new ClassB(); // Upcasting
		object.message();// Message from Class B
	}

}
