package week6Tuesday;

public class Class1 {
	int a;
	String bString;
	
	void method1(){
		System.out.println(a);
		System.out.println(bString);
	}
	
	
	public static void main(String[] args) {
		Class1 object1 = new Class1();
		object1.a = 10;
		object1.bString = "Java";
		//System.out.println(object1.a + " " + object1.bString);
		
		Class1 object2 = new Class1();
		object2.a = 100;
		object2.bString = "c++";
		//System.out.println(object2.a);
		
		object1.method1();
		object2.method1();
		
	}
	
}
