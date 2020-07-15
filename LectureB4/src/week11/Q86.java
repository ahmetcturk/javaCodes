package week11;

class A{
	public void test(){
		System.out.println("A ");
	}
}

class B extends A{
	public void test(){
		System.out.println("B ");
	}
}
public class Q86 extends A {
public void test(){
	System.out.println("C ");
}
	public static void main(String[] args) {
		A b1 = new A();
		A b2 = new Q86();
		
		//B b4 = new Q86();
		
		A b3 = (B)b2;//line n1 --- > B b4 = new Q86();
		b1=(A) b2;    //line n2
		b1.test();
		b3.test();
	}
}