package week4;

import java.util.concurrent.CountDownLatch;

public class ContinueExample {

	public static void main(String[] args) {
		
		// Continue Statement
		// We are using continue statement in order to skip statements
		
		// Print all the numbers except 5
		
		for (int i = 0; i < 10; i++) {
			if (!(i==5)) {
			//	System.out.println(i);
			}
		}

		// how to skip even numbers with continue statement
		for (int i = 0; i < 10; i++) {
			if (i%2 == 0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
