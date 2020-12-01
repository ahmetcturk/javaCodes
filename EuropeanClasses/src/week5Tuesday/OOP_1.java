package week5Tuesday;

public class OOP_1 {
// Object is a collection of variables and methods
	public static void main(String[] args) {
		Class reference = new Class();
		reference.a = 100;
		reference.method();
		System.out.println(reference.a);
		reference.method2();
		
		Class reference2 = new Class();
		reference2.a = 90;
		System.out.println(reference2.a);
	}
}
class Class{
	int a; // default value is 0
	void method(){
		System.out.println("This is a method");
	}
	void method2(){
		System.out.println("This is a method2");
	}
	
}
