package week7Thursday;
// This Keyword : working like a reference for the current class
// 1) Call current class field
// 2) Call current class method
// 3) Call current class constructor

class Subclass3 {
	int a = 4298; 
	
	public Subclass3(int a) {
		this.a = a;
	}
	public Subclass3() {
		this(4000);
	}
	
	void method(int a){
		System.out.println(a + this.a);
	}
	void method2(){
		this.method(9); // this keyword here is optional
		method(8);
	}
	
}

public class ThisKeyword {

	public static void main(String[] args) {
		new Subclass3().method(9);
		System.out.println(new Subclass3().a);
	}

}
