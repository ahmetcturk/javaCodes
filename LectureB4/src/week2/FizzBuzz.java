package week2;

public class FizzBuzz {

	public static void main(String[] args) {
		/*
		 * if our number is divisible by 2 ( 0 remainder), we will print Fizz if
		 * our number is divisible by 3 ( 0 remainder), we will print Buzz if
		 * our number is divisible by 2 and 3 ( 0 remainder), we will print FizzBuzz
		 * 
		 */
		// 
		int number = 12;
		if (number%3==0 && number%2==0) {
			System.out.println("FizzBuzz");
		} 
		else if (number%3==0) {
			System.out.println("Buzz");
		}
		else if (number%2==0) {
			System.out.println("Fizz");
		}
		else {
			System.out.println("Neither Fizz nor Buzz");
		}
	}

}
