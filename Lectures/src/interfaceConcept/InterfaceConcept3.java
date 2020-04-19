package interfaceConcept;

interface Interface1{
	public void f1();
}

interface Interface2 extends Interface1{
	public void f2();
}
class A implements Interface2{

	@Override
	public void f1() {
		System.out.println("Contents of interface 1");
		
	}

	@Override
	public void f2() {
		System.out.println("Contents of interface 2");
		
	}
	
	public void f3() {
		System.out.println("Contents of interface A");
		
	}
	
}
public class InterfaceConcept3 {

	public static void main(String[] args) {
		Interface2 v2;
		v2 = new A();
		v2.f1();
		v2.f2();
		A x1 = new A();
		x1.f3();
	}

}
