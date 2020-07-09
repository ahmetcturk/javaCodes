package week10Wednesday;

import java.io.IOException;

public class ExceptionHandlingConcept5 {

	// Throws keyword : declaration of exception in method header
	// throw : creates exception
	static void method() throws IOException{
		throw new IOException();
	}
	
	public static void main(String[] args) throws InterruptedException{
		
		System.out.println("1");
		
		Thread.sleep(4000);
		
		System.out.println("2");
		
		try {
			method();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			
		}

	}

}
