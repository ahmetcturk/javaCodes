package interviewCoding_1;

public class FibonacciNumbers {

	public static void main(String[] args) {
		// Find fibonacci numbers
		
		int a = 0;
		int b = 1;
		
		for (int i = 0; i <12; i++) {    
			System.out.print(a + " ");
			int sum = a +b;
			a = b;
			b = sum;
		}
		
		
		

	}

}
