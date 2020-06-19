package week7Recap;

// This and super keyword for invoking constructors
// If our superclass has constructor, one of the superclass constructor needs to be invoked
// when we are creating subclass object

class class1{
	
	public class1(int a) {
		System.out.println("int parameter constructor");
	}
	
	public class1(double a) {
		this(9); // This statement invokes int parameter constructor
		System.out.println("double parameter constructor");
		
	}
}


public class Example3 extends class1 {

	public Example3() {
		super(4.0);// This statement invokes double parameter constructor
	}
	
	public static void main(String[] args) {
		new Example3();

	}

}
