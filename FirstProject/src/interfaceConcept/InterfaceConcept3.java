package interfaceConcept;

interface Interface1{
	public void f1();
}

interface Interface2 extends Interface1{
	public void f2();
}

public class InterfaceConcept3 implements Interface2{
	
	public static void main(String[] args) {
		InterfaceConcept3 object = new InterfaceConcept3();
		object.f1();//Content of Interface1 interface
		object.f2();//Content of Interface2 interface
		object.f3();//Content of InterfaceConcept3 class

	}

	@Override
	public void f1() {
		System.out.println("Content of Interface1 interface");
		
	}

	@Override
	public void f2() {
		
		System.out.println("Content of Interface2 interface");
	}
	
	public void f3(){
		System.out.println("Content of InterfaceConcept3 class");
	}

}
