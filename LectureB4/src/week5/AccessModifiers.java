
// In this example, we demonstrate how to call methods from different classes
package week5;

// AccessModifiers.java is a source file
// We can call methods from another classes or packages 
// in our project
// In order to call some other classes non-static methods, 
// you need to create object for that class

public class AccessModifiers {

	public static void main(String[] args) {
		MethodConcept1 object = new MethodConcept1();
		object.printHelloWorld();
		NonVoidMethods1 object2 = new NonVoidMethods1();
		int addition = object2.addition(9, 23);
		System.out.println(addition);
	}

}

