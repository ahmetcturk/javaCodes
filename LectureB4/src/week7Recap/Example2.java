package week7Recap;
// This example demonstrates overriding and overloading
class Test{
	void method1(){
		System.out.println("This is Test Class");
		
	}
	
	void method1(int a){
		System.out.println("This is Test Class");
		
	}
	
}
public class Example2 extends Test {

	void method1(){
		System.out.println("This is example2 class");
	}

	public static void main(String[] args) {
		
		new Example2().method1();
	}
}
