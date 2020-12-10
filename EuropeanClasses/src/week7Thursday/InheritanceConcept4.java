package week7Thursday;

class SuperClass{
	int a ;

	public SuperClass(int a) {
		this.a = a;
	} 

}

class SubClass extends SuperClass{
	// Rule : In order to create subclass object, subclass constructor and superclass constructors needs to match
	// If there is any constructor in superclass, we need to invoke superclass constructor (super())
	public SubClass(int b) {
		super(b); // invokes superclass constructor
	}
}

public class InheritanceConcept4 {

	public static void main(String[] args) {
		SubClass obj = new SubClass(100);
		System.out.println(obj.a);
	}

}
