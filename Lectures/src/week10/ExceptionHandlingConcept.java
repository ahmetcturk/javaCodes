package week10;

public class ExceptionHandlingConcept {

	public static void main(String[] args) {
		
	
	try {
		System.out.println(9/0); // This line throws Arithmetic exception
		
	} 
	catch (Throwable e) { // We need to put ArtihmeticException or superclass of it.
	// Catch Parameter can be changed into any subclass of Exception Class
	// Throwable - Exception - ArithmeticException can be used in my catch block
		
		System.out.println("An exception Handled");
	}
	
	System.out.println("Hello Silicone Labs ! ");
		
		
		
		
		
		
	}

}
