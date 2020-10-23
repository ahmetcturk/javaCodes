package week5Thursday;

public class StaticMethods {
	
	public static void main(String[] args) {
		
		
		method1();
		findReverseString("Silicone Labs");
		
	}
	// Create a static method which finds the reverse of the strings
	
	static void findReverseString(String string){
		for (int i = string.length() -1; i >= 0; i--) {
			System.out.print(string.charAt(i));
		}
	}
	
	

	// Public : method is only accessible within the whole project
	public static void method2(){
		
	}
	
	// Default : method is only accessible within the package
	static void method1(){
		System.out.println("Method 1");
	}

}
