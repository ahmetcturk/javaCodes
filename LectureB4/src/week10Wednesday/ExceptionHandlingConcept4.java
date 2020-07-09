package week10Wednesday;

import java.io.IOException;

// Two ways to handle exception
// 1) Try catch, 
// 2) add throws declaration (prevents compilation error)
public class ExceptionHandlingConcept4 {
	
	// throws keyword : Declares that method throws exception
	static void method() throws IOException { 
		
		// throw keyword throws exception (artificial exception)
		throw new IOException();
		
	}
	
	public static void main(String[] args) {
		
		try {
			method();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception handled");
		}
	
		
		
	}

}
