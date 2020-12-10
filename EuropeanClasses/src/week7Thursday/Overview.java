package week7Thursday;

// Inheritance : Property sharing of super class with subclass
/*
 * OOP : 
 * + Inheritance
 * + Encapsulation
 * + Polymorphism
 * + Abstraction
 */

class Parent{
	int a;
	void method(){
		System.out.println(1);
	}
}
class Child extends Parent{
	int b;
	void method(){
		System.out.println(2);
	}
}

public class Overview {

	public static void main(String[] args) {
		new Child().method();
		new Parent().method();

	}

}
