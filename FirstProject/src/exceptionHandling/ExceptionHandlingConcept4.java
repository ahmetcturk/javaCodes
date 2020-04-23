package exceptionHandling;

public class ExceptionHandlingConcept4 {

	public static void main(String[] args) {

		// Nested try-catch
		try {

			System.out.println(9 / 1);

			try {

				System.out.println(9 / 0); // this exception has been caught by outer catch block

			} catch (IndexOutOfBoundsException e) {
				System.err.println("Inner Catch Block");
			}

		} 
		catch (ArithmeticException e) {
			System.err.println("Arithmetic Exception");
		}
		catch (Exception e) {
			System.err.println("Arithmetic Exception");
		}
		catch (Throwable e) {
			System.err.println("Arithmetic Exception");
		}
		System.out.println("Hello World");
		
//		catch (Exception e) {
//			System.err.println("Outer Catch Block");
//		}

	}

}
