package week8Thursday;
//- Can an abstract class have any methods other than abstract methods

import java.lang.reflect.Method;

// + It can have both concrete and abstract methods

// + Can we instantiate a class which has not abstract method but declare with abstract word ? 
// - No, we can't instantiate abstract classes

// + Can abstract methods be private ? 
// - No, abstract methods can not be private

// + Can abstract methods be static ? 
// - No, abstract method can not be static

// + Why we need constructors in abstract classes ? 
// - Abstract classes can have subclasses, and in order to instantiate(create an object) for subclasses
//   we need to invoke superclass constructor(explicitly or implicitly)

// We can not use abstract keywords in constructor
// Abstract classes can have instance variables, concrete methods and constructors.

// This example demostrates how abstract methods should be implemented
// If we have one abstract class and one child abtract subclass and another child concrete class ; 
// 1) one of the child classes needs to implement abstract methods in the abstract class



abstract class Class1{
	int a; 
	abstract void method1();
}

abstract class Class2 extends Class1{
	abstract void method2();
}

public class AbstractConcept3 extends Class2 {

	
	public static void main(String[] args) {

	}

	@Override
	void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void method1() {
		// TODO Auto-generated method stub
		
	}

}
