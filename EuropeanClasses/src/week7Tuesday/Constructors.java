package week7Tuesday;
// This example shows object creation hierarchy
// This example demostrates in which order constructors are triggering
class A3{
	public A3() {
		System.out.println("A3");
	}
}
class B3 extends A3{
	public B3() {
		System.out.println("B3");
	}
}
class C3 extends B3{
	public C3() {
		System.out.println("C3");
	}
}

public class Constructors {

	public static void main(String[] args) {
		C3 obj = new C3();
	}

}
