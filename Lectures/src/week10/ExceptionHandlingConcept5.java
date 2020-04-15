package week10;

// This program demonstrates working of throws
public class ExceptionHandlingConcept5 {

	static void method() throws Exception{ // Declares that this method throws exception
		System.out.println("This is method () ");
		throw new ArithmeticException(); // throw keyword throws exception objects
	}
	
	public static void main(String[] args) {
		
		// There are two ways to handle this exception
		// 1 ) Try Catch
		// 2 ) Add throws keyword to main method
		
		try {
			method();
		} 
		catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.err.println("Arithmetic Exception");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("Exception");
		}
		
	}

}
