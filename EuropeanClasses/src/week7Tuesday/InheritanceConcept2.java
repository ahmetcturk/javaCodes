package week7Tuesday;









class A{
	int a = 10;
	void a(){System.out.println("a");}
}
class B extends A{
	int b = 20;
	void b(){System.out.println("b");}
}
class C extends B{
	int c = 30;
	void c(){System.out.println("c");}
}

public class InheritanceConcept2 {

	public static void main(String[] args) {
		C ref = new C();
		System.out.println(ref.a + "\n" + ref.b + "\n" + ref.c);
		ref.a();
		ref.b();
		ref.c();
	}

}
