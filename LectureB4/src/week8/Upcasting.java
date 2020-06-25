package week8;

// Up casting : Creating superclass reference with subclass object
class SuperClass {
	int superClassField;

	void superClassMethod() {
		System.out.println("superclass Method");
	}

	void overridenMethod() {
		System.out.println("Overridin Method in superclass");
	}
}

class Subclass extends SuperClass {
	int subclassField;

	void overridenMethod() {
		System.out.println("Overridin Method in subclass");
	}

	void subClassMethod() {
		System.out.println("Subclass Method");
	}
}

public class Upcasting {
	public static void main(String[] args) {
		// Upcasted objects has access to superclass fields and methods(except overriden method). 
		// Overriden methods coming from subclass
		SuperClass object = new Subclass();
		object.superClassField = 9;
		object.superClassMethod(); // superclass Method
		object.overridenMethod(); // Overridin method in subclass
		
		object = new SuperClass();
		object.overridenMethod();
		
	}

}
