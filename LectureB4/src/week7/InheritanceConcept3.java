package week7;

// This example demonstrates multilevel inheritance in java

class A{
	int a = 10; 
	void a(){
		System.out.println("Method a");
	}
}
class B extends A{
	int b = 11; 
	void b(){
		System.out.println("Method b");
	}
}
class C extends B{
	int c = 12; 
	void c(){
		System.out.println("Method c");
	}
}
public class InheritanceConcept3 {

	public static void main(String[] args) {
		C objectC = new C();
		System.out.println(objectC.a);
		System.out.println(objectC.b);
		objectC.a();
		

	}

}
