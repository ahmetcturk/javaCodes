package week10;

abstract class SuperClass{
	public SuperClass() {
		System.out.println("SuperClass Constructor");
	}
	int x = 50;
	void method(){System.out.println("Superclass");}
	void method1(){System.out.println("Superclass1");}
}

public class Group2 extends SuperClass {
	int x = 100;
	void method(){System.out.println("Subclass");}
	public Group2() {
		System.out.println("Subclass constructor");
	}
	public static void main(String[] args) {
		// How can we use int x in the superclass ? 
		// First we can create an object for Group2
		// Second upcasting
		
		Group2 object1 = new Group2();
		System.out.println(object1.x);

		//upcasting : Superclass(or interface) identifier = new Subclass();
		SuperClass object2 = new Group2();
		System.out.println(object2.x); 
		
		object2.method(); // Output : Subclass
		System.out.println(object2.x); // output : 50
		object2.method1(); // Output : Superclass1
		System.out.println(object1.x); // output : 100
		
		
	}

}
