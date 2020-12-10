package week7Tuesday;

// 1) Inheritance only works one way, properties won't be inherited from
// from subclass to superclass

// 2) Private properties won't be inherited by subclass

// 3) Non-private properties will be inherited from superclass to subclass
class SuperClass{ // Parent Class
	int a;
	private String bString;
	void SCMethod(){
		System.out.println("Super class method");
	}
}

class SubClass extends SuperClass{ // Child Class
	int c;
	void SUBMethod(){
		System.out.println(a + "\n" + c);
		SCMethod();
	}
}

// Connecting one class to another(SuperClass - Subclass)
public class InheritanceConcept1 {

	public static void main(String[] args) {
//		new SubClass().SCMethod();
//		new SuperClass().SCMethod();
		new SubClass().SUBMethod();
	}

}
