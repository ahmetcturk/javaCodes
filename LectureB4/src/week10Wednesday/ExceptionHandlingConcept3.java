package week10Wednesday;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingConcept3 {
	
	// finally block will be executed either exception handled or not
	// why finally ? : it is make sure we execute important codes such as closing
	// some connections or streams.
	
	public static void main(String[] args) {
		// After try blocks, we can create multiple catch blocks or
		// we can create finally block.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your height : ");
		try {
			double height = scanner.nextDouble();
			System.out.println("your height : "+ height + " m");
		} 
		catch (InputMismatchException e) {
			System.out.println("Invalid input : ");
		}
		catch (Exception e) {
			System.out.println("Exception caught");
		}
		finally {
			// finally block will always run
			System.out.println("This is finally block");
		}
	
		System.out.println("Program keeps working...");
		
		

	}

}
