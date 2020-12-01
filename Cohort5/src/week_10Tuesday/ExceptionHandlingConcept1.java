package week_10Tuesday;

public class ExceptionHandlingConcept1 {

	public static void main(String[] args) {
		
		String [] array = {"Java", "Cucumber", "PostAPI","Jenkins"};
		
		try {
			System.out.println(array[4]);
		} catch (Throwable e) { // Throwable, exception, runtimeexception and all subclasses..
			System.out.println("Exception");
		}
		System.out.println("Program after catch block");

	}

}
