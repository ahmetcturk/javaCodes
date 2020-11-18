package week4Tuesday;

public class MethodConcept3 {
 // We are using the methods for code reuseability 
	public static void main(String[] args) {
		print("Hello World");
		addition(9, 6);
		reverseString("Silicone Labs");
		reverseString("Selenium");
		reverseString("Ahmet");

	}
    // We are using one for loop for reversing more than one string
	public static void reverseString(String string) {
		// Algorithm of reversing a string
		for (int i = string.length() - 1; i >= 0; i--) {
			System.out.print(string.charAt(i));
		}
		System.out.println();
	}

	static void addition(int a, int b) {
		System.out.println(a + b);
	}

	static void print(String message) {
		System.out.println(message);
	}

}
