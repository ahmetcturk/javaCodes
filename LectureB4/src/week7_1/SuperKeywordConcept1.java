package week7_1;

class BaseClass {
	// Overridden method
	void display() {
		System.out.println("Parent class method");
	}
}

class DerivedClass extends BaseClass {
	// Overriding method
	void display() {
		System.out.println("Derived Class  method");
	}

	void printMsg() {
		// This would call Overriding method
		display();
		// This would call Overridden method
		super.display();
	}

	
}

public class SuperKeywordConcept1 {

	public static void main(String args[]) {
		DerivedClass obj = new DerivedClass();
		obj.printMsg();
	}

}
