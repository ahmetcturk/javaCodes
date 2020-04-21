package oop1;

class SuperClass {
	int superClassField;

	void superClassMethod() {
		System.out.println("superclass method");
	}
	void overridenMethod(){
		System.out.println("Overriden method in super class");
	}
}

class SubClass extends SuperClass {
	int subClassField;
	void overridenMethod(){
		System.out.println("Overriden method in sub class");
	}
	void subClassMethod(){
		System.out.println("subclass method");
	}
}

public class Reference {

	public static void main(String[] args) {
		// Upcasting
		// We can create a Superclass reference as Subclass object
		// Formula : SuperClass referenceName = new Subclass();
		/*
		 * reference1 will have access to Superclass fields and methods but
		 * overridden methods will be coming from subclass
		 */
		SuperClass reference1 = new SubClass();
		// reference1 have access to superclass field - superclass method - overriden method in subclass
		System.out.println(reference1.superClassField);
		reference1.overridenMethod(); // from subclass
		reference1.superClassMethod();
		
		SuperClass reference2 = new SuperClass();
		reference2.overridenMethod();
	}

}
