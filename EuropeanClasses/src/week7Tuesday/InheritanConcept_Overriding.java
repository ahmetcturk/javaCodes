package week7Tuesday;

import javax.swing.text.ParagraphView;

// If subclass and superclass have same name for a method, we call it overriding


class Parent{
	void speaks(){
		System.out.println("Do your homeworks");
	}
}

class Child extends Parent{
	// Overriding the speaks method from parent class
	void speaks(){
		System.out.println("Ok Mom");
	}
}

public class InheritanConcept_Overriding {
	public static void main(String[] args) {
		Child ref = new Child();
		ref.speaks();
		Parent ref2 = new Parent();
		ref2.speaks();

	}
}
