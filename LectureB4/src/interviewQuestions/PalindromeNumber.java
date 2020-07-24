package interviewQuestions;

import java.util.InputMismatchException;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		// numbers whose reverse and itselves are same.
		// eg. 121, 1234321, 333
		int number = 199;
		int r = 0;
		int sum = 0;
		int t;
		
		t = number;
		
		while(number>0){
			r = number %10; // gets the last digit
			sum = (sum*10) + r;
			number  = number/ 10;
		}
		
		if (t== sum) {
			System.out.println("This is palindrome");
		}
		else {
			System.out.println("This is not palindrome");
		}
		
		

	}

}
