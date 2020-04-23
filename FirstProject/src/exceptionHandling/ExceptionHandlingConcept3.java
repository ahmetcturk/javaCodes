package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingConcept3 {

	public static void main(String[] args) {
		// After try blocks, we need to create one or more catch blocks or
		// finally block should be at the end
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("Enter Your Height : ");
			double height = scanner.nextDouble();
			System.out.println("Your height : " + height + " cm");
		} 
		catch (ArithmeticException e) {
			System.err.println("Arithmetic Exception \n");
		}
		catch (InputMismatchException e) {
			System.err.println("Invalid Input \n");
		}
		finally {
			// finally block will always run
			System.out.println("This is finally block");
		}
		
	}

}
