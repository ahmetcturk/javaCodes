package week7;

public class Super {
public static void main(String[] args) {
}
}

class A{
	int a;
	int b;
	public A() {
		
	}
	public A(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	
}
class B extends A{
	int c;
	int d;
	public B() {
		// TODO Auto-generated constructor stub
	}
	public B(int a, int b, int c, int d) {
		//super(a, b);
		this.c= c;
		this.d = d;
	}
	
	
	
}
class C extends B{

	public C(int a, int b, int C, int d) {
		super(a, b, C, d);
		
	}
	
	
}