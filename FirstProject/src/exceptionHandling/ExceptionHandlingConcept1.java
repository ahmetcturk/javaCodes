package exceptionHandling;


public class ExceptionHandlingConcept1 {

	public static void main(String[] args) {
		
		// after try block, we need to create one or more catch block or finally block
		
		
		try {
			int [] arr = {1,2,3};
			System.out.println(arr[6]); // This will throw Indexoutofbound Exception
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			// Throwable - Exception - IndexOutOFBound - ArrayIndexOutOF 
			// classes can be used as parameter
			System.err.println("Exception\n");
		}
		
		System.out.println("Hello World");
		
	}

}
