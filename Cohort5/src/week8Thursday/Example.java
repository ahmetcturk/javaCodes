package week8Thursday;

class P1 {
	
}
class P2 extends P1 implements I1 {
	
}
interface I1{}

public class Example {

	public static void main(String[] args) {
		P1 obj = new P1();
		P2 obj2 = new P2();
		I1 obj3 = new P2();
		System.out.println(obj instanceof P2);
		System.out.println(obj2 instanceof P1);
		System.out.println(obj3 instanceof I1);

	}

}
