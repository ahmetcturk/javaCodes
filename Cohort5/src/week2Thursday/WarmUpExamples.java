package week2Thursday;

import java.util.Scanner;

public class WarmUpExamples {

	public static void main(String[] args) {
		
		
	// Create a program which determines if the number is positive or negative
		// 0 is not a positive or negative number
		
		// Challenge - Ask this number from user(Scanner), and determine sign
		
		Scanner keybord = new Scanner(System.in);
		System.out.println("Please enter a number : ");
		
		
		int number = keybord.nextInt();
		
		if (number > 0) {
			System.out.println(number + " is positive");
		}
		else if(number<0){
			System.out.println(number + " is negative");
		}
		else {
			System.out.println("Your number is zero");
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
