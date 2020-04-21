package thirdPackage;

public class AccessModifiers {

	// access modifiers : private - public - default (no keyword)
	
	void method1(){ // access modifier : default
	//non-static, we need to create an object to call this method
		System.out.println("This is method 1");
	}
	
	static void method2(){ // access modifier : default
		// static method, this method can be called without creating object
		System.out.println("This is method 2");
	}
	
	public static void method3(){
		// access modifier : public, this method can be called from every class in this project
		System.out.println("This is method 3");
	}
	
	public void method4(){ // we need to create object to call this method
		System.out.println("This is method 4");
	}
	
	private static void method5(){ 
	// access modifier : private, this method is reachable only within this class
		System.out.println("This is method 5");
	}
	public static void main(String[] args) {
		AccessModifiers object = new AccessModifiers();
		object.method1();
		method2();
		method3();
		object.method4();
		method5();
	}

}
