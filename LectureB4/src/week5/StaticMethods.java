package week5;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class StaticMethods {

	public static void main(String[] args) {

		// Calling method1
		method1();
		// Calling method2 
		method2();
		
		// Method Signature : Method name and parameters-argument
		reverseString("Silicone Labs");

		// Your Task : 
		// Create a method which finds out if a string is palindrome or not
		// Palindrome : bob(palindrome), anna(palindrome), 
		// robert(not a palindrome...) if a string and reversed version are same, 
		// that string is palindrome
		System.out.println();
		palindrome("Bob");
	}
	
	static void palindrome(String string){
		String reversed = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			reversed += string.charAt(i);
		}
		if (string.equalsIgnoreCase(reversed)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
	}
	
	static void reverseString(String string){
		for (int i = string.length() - 1; i >= 0; i--) {
			System.out.print(string.charAt(i));
		}
	}
	
	
	public static void method1(){
		System.out.println("Method 1");
	}
	
	static void method2(){
		System.out.println("Method 2");
	}
	
}
