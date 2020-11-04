package week7Tuesday;
// This example demonstrates multilevel inheritance

class A{
	int a = 10;
	void a(){
		System.out.println("Method a");
	}
}
class B extends A{
	int b = 11;
	void b(){
		System.out.println("Method b");
	}
	
}
class C extends B{
	int c = 12;
	void c(){
		System.out.println("Method c");
	}
}
public class InheritanceConcept2 {

	public static void main(String[] args) {
		C cObj = new C();
		System.out.println(cObj.a + "\n" + cObj.b + 
				"\n" + cObj.c);
		cObj.a();
		cObj.b();
		cObj.c();
		

	}

}
