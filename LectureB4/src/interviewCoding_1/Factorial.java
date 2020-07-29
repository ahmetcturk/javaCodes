package interviewCoding_1;

public class Factorial {

	public static void main(String[] args) {
		// Find a given given numbers factorial
		
		int num = 4;
		
		int factorial = 1;
		
		for (int i = 1; i <= num; i++) {
			factorial = factorial * i; // factorial *= i
		}
		System.out.println(factorial);
		
		

	}

}
