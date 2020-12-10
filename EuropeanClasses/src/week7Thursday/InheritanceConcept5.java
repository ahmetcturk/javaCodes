package week7Thursday;

// This example demonstrates how super() works,


class SuperClass1{
	int a; 
	public SuperClass1(int a) {
		System.out.println("1");
		this.a = a;
	}
	public SuperClass1() {
		System.out.println("2");
	}
}

class SubClass1 extends SuperClass1{
	int b;
	public SubClass1() {
		//super();
		System.out.println("3");
	}
	SubClass1(int b){
		super(b); // super() keyword always needs to be first statement
		System.out.println("4");
		
	}
}
public class InheritanceConcept5 {

	public static void main(String[] args) {
		new SubClass1(9); // 1,4
		new SubClass1(); // 2,3
		new SuperClass1(3); // 1
		new SuperClass1(); // 2
		
		
	}

}
