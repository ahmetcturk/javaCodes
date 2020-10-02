package week2Thursday;

import java.util.Scanner;

public class WarmUpExamples2 {

	public static void main(String[] args) {
		
		// Create a program which converts point grade to letter grade
		
		/*
		 * 100-86--A
		 * 85-70 -- B
		 * 69-60 -- C
		 * 59-50 -- D
		 * 49-0  -- F
		 * 
		 * 1) Create variables
		 * 2) Determine the conditions
		 * 3) Start to code
		 * 
		 */
		Scanner scanner  = new Scanner(System.in);
		System.out.println("What is your Point Grade ?");
		
		int grade = scanner.nextInt();
		if (grade > 100) {
			System.out.println("Grade invalid");
		}
		else if(grade > 85){
			System.out.println("A");
		}
		else if (grade > 69) {
			System.out.println("B");
		}
		else if (grade > 59) {
			System.out.println("C");
		}
		else if (grade > 49) {
			System.out.println("D");
		}
		else if (grade > 0) {
			System.out.println("F");
		}
		else {
			System.out.println("Invalid Number");
		}
		
		
		
		
		

	}

}
