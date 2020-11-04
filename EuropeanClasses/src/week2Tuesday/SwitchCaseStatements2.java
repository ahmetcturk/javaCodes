package week2Tuesday;

import java.util.Scanner;

public class SwitchCaseStatements2 {

	public static void main(String[] args) {
		// Switch case keys can be only integers, char, String
		/*
		 * A : Excellent
		 * B : Well Done
		 * C : Good Job
		 * D : You passed
		 * F : You failed
		 */
		// Challenge, take the key from user.
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your grade : ");
		String key = keyboard.next();
		
		switch (key) {
		case "A":
			System.out.println("Excellent");
			break;
		case "B":
			System.out.println("Well Done");
			break;
		case "C":
			System.out.println("Good Job");
			break;
		case "D":
			System.out.println("You passed");
			break;
		case "F":
			System.out.println("Failed");
			break;
		default: 
			System.out.println("Invalid Grade");
			
		}
		
		
		

	}

}
