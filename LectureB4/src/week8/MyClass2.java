package week8;

public class MyClass2 {
	
	// Static variables are class level variables
	static int a; 
	// non static variables are object level variables
	int b;
	
	void method(){
		b++;
	}
	
	public static void main(String[] args) {
			
		MyClass2 object1 = new MyClass2();
		MyClass2 object2 = new MyClass2();
		object1.a = 9;
		object1.b = 8;
		object2.a = 99;
		object2.b = 88;
		object1.a = 100;
		
		System.out.println(object1.a); //99
		System.out.println(object2.a); //99
		
		System.out.println(object1.b); // 8
		System.out.println(object2.b); // 88
		System.out.println(object2.a); // 100
	}

}
