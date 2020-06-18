package week7_1;

class ParentClass{
	int superClassField;
	public ParentClass(int a) {
		System.out.println("Constructor of superclass");
		this.superClassField = a;
	}
	void method1(){
		System.out.println("Method 1");
	}

}

class SubClass extends ParentClass{
	public SubClass(int a) {
		// Super keyword for invoking super class constructor
		super(a); // needs to be first statement
		System.out.println("Subclass Constructor");
	}
	void method1() {
		// we are using super keyword to call overriden super class methods
		super.method1();
	}
	void method2(){
		method1(); // calling subclass method1
		super.method1(); // calling superclass method1
	}
}

public class SuperKeywordConcept1 {

	public static void main(String[] args) {
		SubClass object1 = new SubClass(9);

	}

}
