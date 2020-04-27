package PreBootCamp;

public class IfElseConcept {

	public static void main(String[] args) {
		// Welcome Silicone Lab's Brilliant Students
		// Code Hard, Study Hard !

		boolean myBoolean = false;
		
		if (!myBoolean) {
			System.out.println("This is if block");
		} else {
			System.out.println("This is else block");
		}
		
		
		// Let's create a program which is checking the age
		// If the age is greater than or equal to 18, print valid age
		// If the age is less than 18, print invalid age
		int age = 19;
		if (age >=18) {
			System.out.println("This is valid age");
		} else {
			System.out.println("This is invalid age");
		}
		
		
		
		// ***Spicy Q : Create a program which finds if the int number is odd or even
		// Hint : if number is divisible by 2, it is even
		// Hint : if number is not divisible by 2, it is odd
		// Even numbers : 0,2,4,6,8,10....
		// Odd numbers : 1,3,5,7,9,11....
		int number = 9;
		// % = Finds remainder
		System.out.println(11 % 2);
		
		if (number % 2 == 0) {
			System.out.println(number + " is even number");
		} else {
			System.out.println(number + " is odd number");
		}
		
		
		
		
	}

}
