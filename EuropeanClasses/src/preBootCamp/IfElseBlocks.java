package preBootCamp;

public class IfElseBlocks {

	public static void main(String[] args) {
		// Welcome Silicone Lab's Brilliant Students
		// Code Hard, Study Hard !
		
		boolean myBoolean = true;
		
		if (myBoolean) {
			System.out.println("If Block");
		}
		else {
			System.out.println("Else Block");
		}
		
		
		// Question 1 : What will be output of the following code
		
		
		boolean myBoolean2 = false;
		
		if (myBoolean2) {
			System.out.println(1);
		}
		if (!myBoolean2) {
			System.out.println(2);
		} else {
			System.out.println(3);
		}
		
		// Question 2 : Create a program which is checking the age (int age)
		// If age is greater than or equals to 18, print you can vote
		// Otherwise print you can not vote
		
		int age = 10;
		
		if (age >= 18) {
			System.out.println("You can vote");
		} else {
			System.out.println("You can not vote");
		}
		
		// Challenging Question 
		// Question 3 : Create a program which finds if int variable is even or odd number
		// Even = 0,2,4,6,8,10...
		// Odd = 1,3,5,7,9,11...
		// Hint : If a number % 2 == 1 --> This is odd number
		// Hint : If a number % 2 == 0 --> This is even number
		int number = 8;
		
		if (number % 2 == 0) {
			System.out.println("Even Number");
		} else {
			System.out.println("Odd Number");
		}
		

	}

}
