package week8Tuesday;

class SuperClass{
	int a = 19;
	void method(){
		System.out.println(a);
	}
	void method2(){
		System.out.println("2");
	}
}

class Subclass extends SuperClass{
	int a = 1900;
	void method(){
		System.out.println(a);
	}
	void method3(){
		System.out.println("3");
	}
}


public class Upcasting {
	// Up casting : Creating subclass object with super class reference
	public static void main(String[] args) {
		SuperClass ref1 = new SuperClass();
		Subclass ref2 = new Subclass();
		
		// Upcasting : All the fields and methods will be belong to superclass 
		// except overriden methods : Overriden methods will come from subclass
		SuperClass ref3 = new Subclass();
		System.out.println(ref1.a); // 19
		System.out.println(ref2.a); // 1900
		System.out.println(ref3.a); //
		ref1.method(); // 19
		ref2.method(); // 1900
		ref3.method(); // 1900
		ref3.method2();
		//ref3.method3(); // Compiling error
	}

}
