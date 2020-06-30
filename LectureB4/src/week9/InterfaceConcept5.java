package week9;

// This example demonstrates static and default methods in interfaces

interface Iinterface22{
	
	// Not all the methods needs to be abstract in interface (After Java 8)
	
	static void method1(){
		System.out.println("Static method in Interface");
	}
	
	default void method2(){
		System.out.println("This is the default method");
	}
	
}


public class InterfaceConcept5 implements Iinterface22 {

	public static void main(String[] args) {
		
		Iinterface22.method1();
		Iinterface22 object = new InterfaceConcept5();
		object.method2();

	}

}
