package week_10Tuesday;

public class ExceptionHandlingConcept4 {

	public static void main(String[] args) {
		
		try {
			System.out.println(9/0);
		} 
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("String Out Of Bound");
		}
		catch (Exception e) {
			System.out.println("Exception");
		}
		
		finally {
			// Finally block will work in any condition, either one of the catch blocks work or not
			System.out.println("Database connection is closing...");
			System.out.println("Database file resource is closing...");
		}

	}

}
