package myFirstPackage;

public class ElseIfBlocks {

	public static void main(String[] args) {
		// Welcome Silicone Lab's Brilliant Students
		// Code Hard, Study Hard !
		
		// else if blocks 
		
		if (true) {
			System.out.println("If Block");
		}
		else if (false) {
			System.out.println("Else if Block");
		}
		else {
			System.out.println("Else Block");
		}

		// this blocks prints Else Block
		if (false) {
			System.out.println("If Block");
		}
		else if (false) {
			System.out.println("Else if Block");
		}
		else {
			System.out.println("Else Block");
		}
		
		
		// This block will print If Block
		if (true) {
			System.out.println("If Block");
		}
		else if (true) {
			System.out.println("Else if Block");
		}
		else {
			System.out.println("Else Block");
		}
	
		
		// This block will print Else if Block
		if (false) {
			System.out.println("If Block");
		}
		else if (true) {
			System.out.println("Else if Block");
		}
		else {
			System.out.println("Else Block");
		}
	
		// We can add as many else if as we need
		// First true conditioned block will be executed
		// This blocks prints If Block
		if (true) {
			System.out.println("If Block");
		}
		else if (true) {
			System.out.println("First Else if Block");
		}
		else if (true) {
			System.out.println("Second Else if Block");
		}
		else {
			System.out.println("Else Block");
		}
		
		// Create a program which checks the numbers sign and prints the sign as an output
		// if number = 0, it will print out that your number is zero
		// if the number is positive, prints your number is positive
		// if the number is negative, print your number is negative
		
		int num1 = 100; 
		// I have 3 condition, so i need 3 blocks
		if (num1 == 0) {
			System.out.println("Your number is zero");
		} 
		else if (num1 > 0) {
			System.out.println("Your number is positive");
		}
		else {
			System.out.println("Your number is negative");
		}
		
		
		// We will create a grade checking program
		// Program will convert the numeric grading into letter grading
		/*
		 * A = 90-100
		 * B = 80-89
		 * C = 70-79
		 * D = 60-69
		 * F = 0-59
		 */
		int numericGrade = 15;
		String letterGrade = ""; // this is empty because we don't know yet, which letter it will be
		if (numericGrade >=90) {
			letterGrade = "A";
		}
		else if (numericGrade >= 80) {
			letterGrade = "B";
		}
		else if (numericGrade >= 70) {
			letterGrade = "C";
		}
		else if (numericGrade >= 60) {
			letterGrade = "D";
		}
		else {
			letterGrade = "F";
		}
		
		System.out.println("Your letter grade is  :" + letterGrade);
		
		
		
	}

}
