package exceptionHandling;

import java.util.Scanner;

// All the methods which possibly throws exception either needs to have throws keyword,
// Or should be surrounded by try-catch in order to avoid unexpected terminations
public class ExceptionHandlingConcept6 {
	
	static void divide(int a, int b) throws ArithmeticException{
		System.out.println(a/b);
	}
	
	static int inputNumerator(Scanner scanner){
		System.out.println("Input Numerator : ");
		return scanner.nextInt();
	}
	static int inputDenominator(Scanner scanner){
		System.out.println("Input Denominator : ");
		return scanner.nextInt();
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// divide method compiles successfuly, because it throws Runtime(unchecked) exception 
		try {
			divide(inputDenominator(scanner), inputNumerator(scanner));
		} catch (ArithmeticException e) {
			
			System.err.println("Error");
		}

	}

}
