package week_10Tuesday;

public class ExceptionHandlingConcept2 {

	public static void main(String[] args) {

		int [] arr = {2,4,5,6};
		
		try {
			System.out.println("Silicone Labs".charAt(99)); // String out of bound exception
			System.out.println(9/0);
			System.out.println(arr[10]);
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index is incorrect");
		}
		catch (ArithmeticException e) {
			System.out.println("Arithmetic calculation is wrong");
		}
		catch (Exception e) {
			System.out.println("Error event happened");
		}
		

	}

	
}
