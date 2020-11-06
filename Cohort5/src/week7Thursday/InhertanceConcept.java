package week7Thursday;

// Inheritance is basically using superclass properties in subclasses
// If we have two methods that same name and parameters and return type in superclass and subclass, this is overriding
// In overriding, method body can be different, but method header needs to be same
class A{
	private int a = 90;
	String bString;
	void method(){
		System.out.println("SuperClass");
	}
}
class B extends A{
	
	void method(){
		System.out.println("SubClass");
	}
}

public class InhertanceConcept {

	public static void main(String[] args) {
		B subClassObject = new B();
		subClassObject.method();
		
		A superClassObject = new A();
		superClassObject.method();

	}

}
