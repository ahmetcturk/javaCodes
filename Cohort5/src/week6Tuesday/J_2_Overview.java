package week6Tuesday;

public class J_2_Overview {
	// non void methods
	public static void main(String[] args) {
		int number1 = method();
		int number2 = method2(100, 50);
		System.out.println(number2);
		
		// In order to call non-static methods, we need to create object
		J_2_Overview object = new J_2_Overview();
		object.method3();
		
		int a = method2(1,2);
	}
	
	void method3(){
		System.out.println("This is method 3");
	}
	
	static int method2(int a, int b){
		return a + b;
	}
	
	
	
	static int method(){
		System.out.println("I am returning number...");
		return 90;
	}
	
	

}
