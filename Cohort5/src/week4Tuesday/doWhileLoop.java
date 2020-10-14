package week4Tuesday;

public class doWhileLoop {

	public static void main(String[] args) {
		
		// Do while is very similar to while loop
		/*
		 * Do while loop will work at least one time no matter 
		 * what is the condition value
		 */

		boolean myBoolean = false;
		
		do {
			System.out.println("Hello World");
		} while (myBoolean);
		
		
		// Print numbers from 0-10 with do while loop
		
		int counter = 0 ; 
		do {
			System.out.println(counter);
			counter++;
		} while (counter <= 10);
		
		
		
	}

}
