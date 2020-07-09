package week10Wednesday;

public class ExceptionHandlingConcept {

	// Exception : Error events which can occur during execution time, 
	// it can disrupts the flow of the program
	
	// Try - Catch
	public static void main(String[] args) {
		
		try{
			System.out.println(9/0);
		}
		catch (ArithmeticException e) { 
			// Parameter can be changed into
			// ArithmeticException or it's superclasses
			
			System.out.println("Exception handled, program can flow..");
		
		}
		
		System.out.println("Hello World");
		
		
		
		
	}
	
}
