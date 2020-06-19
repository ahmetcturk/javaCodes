package week7Recap;

class class2{
	int a=11;
	void method(){
		System.out.println("method in class 2");
	}
}

public class Example4 extends class2 {
	int a=5;
	void method(){
		System.out.println("method in Example 4");
		System.out.println(this.a + "\n" + super.a);
	}
	void method2(){
		this.method();
		super.method();
	}
	public static void main(String[] args) {
		new Example4().method();
		new Example4().method2();
	}

}
