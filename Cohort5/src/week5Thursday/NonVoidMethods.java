package week5Thursday;

public class NonVoidMethods {
	
	// What is the difference between void and non-void methods
	// In non void methods, we don't need to use return keyword.
	public static void main(String[] args) {	
		//                    10
		System.out.println(method1() + 19);
		int number = method1();
	
		System.out.println(sum(9, 10));
		
		System.out.println(square(9));
	}
	
	// Create a method which finds square of the numbers
	static int square(int a){
		return a*a;
	}
	
	// int, String ,double....
	static int method1(){
		return 10;
	}
	
	static int sum(int i, int b){
		return i + b ;
	}
	
	
	

}
