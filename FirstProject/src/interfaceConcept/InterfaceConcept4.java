package interfaceConcept;

// This example demonstrates static and default methods in interfaces


interface Iinterface2{
// no need to implement static methods in implementer classes
	static void method1(){
		System.out.println("Static method in Interface");
	}
// no need to implement default methods in implementer classes	
	default void method2(){
		System.out.println("Default method in interface");
	}
}


public class InterfaceConcept4 implements Iinterface2 {
	
	public static void main(String[] args) {
		InterfaceConcept4 object = new InterfaceConcept4();
		object.method2();
		//object.method1();//-- Compiler Error
		Iinterface2.method1();
	}

}
