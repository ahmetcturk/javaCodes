package week_10Tuesday;

import java.io.IOException;

public class ExceptionHandlingConcept6 {

	public static void main(String[] args) throws Exception{
		// Throws keyword is telling the programmer that the method can throw exception
		// It is like a warning to the developer who is intend to use that specific method
		// After throws declaration, if there is an unchecked exception type, this method 
		// will be able to called in other methods without handling exception
		
		// After throws declaration, if there is an checked exception type, this method 
		// will be able to called in other methods after handling the exception
		
		// Checked : Compile time exceptions
		// Unchecked : Runtime exceptions
			
		division(9, 0);
	}
	

	static void division(int a , int b) throws Exception{
		System.out.println(a/b);
	}
	

}
