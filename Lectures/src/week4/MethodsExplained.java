package week4;

public class MethodsExplained {
	void method1(){
	//access modifier : default, it can be called only within this package	
	// non-static method
	// we need to create object to call this method
	System.out.println("This is method 1");
	}
	static void method2(){
	//access modifier : default, it can be called only within this package
	//static method	
	System.out.println("This is method 2");
	}
	public static void method3(){
	//access modifier : public can be accessed from everywhere in a project
	// static method		
	System.out.println("This is method 3");
	}
	public void method4(){
		//access modifier : public	
		// non-static method
		// we need to create object to call this method
	System.out.println("This is method 4");
	}
	private static void method5() {
	//access modifier : private, can be called within only this class
	//static method	
		
	System.out.println("This is method 5");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method3(); // calling static way
		MethodsExplained object = new MethodsExplained();
		object.method1();
		method2();
		object.method4();
		method5();
	}

}
