package interviewCoding_1;

public class SwapVariables {

	public static void main(String[] args) {

		// Input : x = 10, y = 20;
		// Output : x = 20, y = 10

		// Input : x = 200, y = 100
		// Output : x = 100, y = 200
		
		int x = 10, y = 20;
		
		// using temporary variables
		
		int temp = x;
		
		x = y;
		y = temp;
		
		
		System.out.println(x + " " + y);
		
		// Swap again without temporary variable
		
		x = x-y;
		y = x+y;
		x = y-x;
		
		System.out.println(x + " " + y);
		
		
		

	}

}
