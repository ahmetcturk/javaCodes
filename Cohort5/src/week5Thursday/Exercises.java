package week5Thursday;

public class Exercises {

	public static void main(String[] args) {
		System.out.println(findMaximum(1, 10));
		System.out.println(findReverse("Java"));
		System.out.println(findReverse("Selenium"));
		System.out.println(checkEven(9));
	}
	
	// Create a method which returns the maximum int value from 2 int numbers
	// maximum(9,7) --> 9
	
	static int findMaximum(int a, int b){
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
	
	// Create a method which returns the reverse of the string
	
	static String findReverse(String string){
		String reverse = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			reverse = reverse + string.charAt(i);
		}
		return reverse;
	}
	
	// Create a method which returns true if number is even, otherwise it will return false
	// checkEven(8) --> true
	// checkEven(9) -- > False
	
	static boolean checkEven(int a){
		if (a%2==0) {
			return true;
		} else {
			return false;
		}
	}
	

}
