package week4;

public class BreakStatementExample {

	public static void main(String[] args) {
		
		// Break statement : We are using break statements to kill (terminate) 
		// the loops and switch case blocks
		
		// I will create a program which counts from 0 -10, 
		// but it will stop as soon as it reaches 5
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 5) {
				break;
			}
		}

	}

}
