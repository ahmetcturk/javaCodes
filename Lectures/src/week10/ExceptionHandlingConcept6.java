package week10;

import java.lang.reflect.Method;
import java.util.Scanner;

public class ExceptionHandlingConcept6 {
	
	static void divide(int a, int b) throws ArithmeticException{
		System.out.println(a/b);
	}
	
	static int inputNumerator(Scanner input){
		System.out.println("Enter the numerator : ");
		int numerator = input.nextInt();
		return numerator;
	}
	static int inputDenominator(Scanner input){
		System.out.println("Enter the denominator  : ");
		int denominator = input.nextInt();
		return denominator;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			divide(inputNumerator(scanner),inputDenominator(scanner));
		} 
		catch (ArithmeticException e) {
			System.out.println("Undefined");
			
		}catch (Exception e) {
			System.out.println("Invalid input");
			
		}

	}

}
