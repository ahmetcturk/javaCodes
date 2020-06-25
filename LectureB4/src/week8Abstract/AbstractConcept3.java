package week8Abstract;

// - Can my abstract class needs to have only abstract methods ? 
// + It can have both concrete or abstract methods

// We can not use abstract keyword in our constructors

// -Can we instantiate a class which has no abstract method but declared with abstract keyword ?
// + No, we can't instantiate abstract classes

// -Can we declare abstract methods as private ?
// +No, Abstract methods can not be private

// -Can we declare abstract methods as static ? 
// +Abstract classes can not be static

// Abstract classes can have instance variables, concrete methods and constructors

// +If we can not instantiate the abstract classes, why we have constructors ? 
// -

abstract class SuperClass1{
	public SuperClass1() {
		System.out.println("SuperClass");
	}
}

public class AbstractConcept3 extends SuperClass1{

	
	public AbstractConcept3() {
		System.out.println("Abstract Conept");
	}
	
	
	public static void main(String[] args) {
		AbstractConcept3 object = new AbstractConcept3();

	}

}
