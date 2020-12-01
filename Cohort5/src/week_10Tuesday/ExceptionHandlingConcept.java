package week_10Tuesday;

public class ExceptionHandlingConcept {

	public static void main(String[] args) {
		// Exception : Error events that can occur during execution time
		// Exceptions can disturbs the flow of the program
		
		try {
			// Catch block will work only during error event
			System.out.println(9/0); // This calculation is mathematically undefined
			System.out.println("Hello World");
		} 
		catch (ArithmeticException e) {
			// Parameter can be arithmetic exception and it's superclasses
			System.out.println("Undefined");
		}
		
		System.out.println("Hello");
		
		
	}

}
