package week10Wednesday;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionHandlingConcept6 {

	static int inputNumerator(Scanner scanner){
		System.out.println("Input numerator : ");
		return scanner.nextInt();
	}
	
	static int inputDenominator(Scanner scanner){
		System.out.println("Input Denominator : ");
		return scanner.nextInt();
	}
	
	static void divide(int a, int b) throws RuntimeException{
		System.out.println(a/b);
	}

	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// if our method has throws declaration for runtime (unchecked) exception
		// it will not give underlined warning where it has been called
		try {
			divide(inputNumerator(scanner), inputDenominator(scanner));
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			System.out.println("Undefined");
		}

	}

}
