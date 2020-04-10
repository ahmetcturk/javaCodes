package week10;

import java.util.Scanner;

public class ExceptionHandlingConcept3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// after try blocks, we need to create one or more catch blocks or finally block
		// finally block should be at the end
		try {
		System.out.println("Enter your height : ");
		double height = scanner.nextDouble();
		System.out.println("Your height : " + height + " cm");
		}
		catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception handled");
		}
		catch (Exception e) {
			System.out.println("Exception");
		}
		finally {
			// finally block will always run
			System.out.println("Finally block has been activated");
		}
		
		
		
	}

}
