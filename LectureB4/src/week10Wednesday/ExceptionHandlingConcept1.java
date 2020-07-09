package week10Wednesday;

public class ExceptionHandlingConcept1 {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3};
		
		try {
			System.out.println(arr[7]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Exception \n");
		}
		
		System.out.println("Hello Again !");

	}

}
