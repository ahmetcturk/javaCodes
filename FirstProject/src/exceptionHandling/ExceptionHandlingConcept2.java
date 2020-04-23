package exceptionHandling;

public class ExceptionHandlingConcept2 {

	public static void main(String[] args) {

		// After try block, multiple catch blocks and one finally block can be created
		// After first exception, program will be terminated. Other exceptions won't be on console
		
		try {
			int arr [] = {4298};
			//System.out.println(arr[2]); // ArrayIndexOutOfBound Exception
			System.out.println(9/0); // ArithmeticException
			System.out.println("Hello Silicnoe Labs");
		} 
		catch (ArithmeticException e) {
			
			System.out.println("Arithmetic Exception");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Array Index Exception");
		}
		catch (Exception e) {
			
			System.out.println("Exception");
		}
		
		
	}

}
