package inheritanceConcept;

// We will demonstrate multilevel inheritance in this example

class A {
	int a;

	void a() {
		System.out.println("Method A");
	}
}

class B extends A {
	int b;

	void b() {
		System.out.println("Method B");
	}
}

class C extends B {
	int c;

	void c() {
		System.out.println("Method C");
	}
}

public class InheritanceConcept3 {
	public static void main(String[] args) {
		C c = new C();
		// Class C object have access to all properties of the superclasses (A - B - C)
		B b = new B();
		// Class B object will have access to Class superclass (B-C)
		A a = new A();
		// Class A object will have access to it's own properties
	}
}






