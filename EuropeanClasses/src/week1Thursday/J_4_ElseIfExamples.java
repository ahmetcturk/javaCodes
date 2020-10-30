package week1Thursday;

public class J_4_ElseIfExamples {

	public static void main(String[] args) {
		
		// Only one of the blocks will be executed, 
		// First true conditioned block will be executed
		
		boolean myBoolean = true;
		if (!myBoolean) {
			System.out.println("If Block");
		} 
		
		else if (true) {
			System.out.println("Else If Block");
		}
		else if (false) {
			System.out.println("Second Else if Block");
		}
		
		else {
			System.out.println("Else block");
		}
		
		
		// Create a program which check if integer is negative, positive or 0
		int number = 0;
		
		if (number > 0) {
			System.out.println("Number is positive");
		} 
		else if (number<0) {
			System.out.println("Number is negative");
		}
		else {
			System.out.println("Number is 0");
		}
		
		// We have integer, if integer is divisible by 2, print Fizz
		// If it is divisible by 3, print Buzz, 
		// If it is divisible by both of them, print FizzBuzz
		// If it is not divisible by any of them, print Neither Fizz nor Buzz
		// Check with 12
		
		int integer = 11;
		
		if (integer%2==0 && integer%3==0) {
			System.out.println("FizzBuzz");
		}
		else if (integer%3==0) {
			System.out.println("Buzz");
		}
		else if (integer%2==0) {
			System.out.println("Fizz");
		}
		else {
			System.out.println("Neither Fizz nor Buzz");
		}
		
		// Create a program which turns Numeric Grade into Letter Grade
		/*
		 * Numeric Grade = 0-100
		 * 100-90 :A
		 * 89-75 : B
		 * 74-70 : C
		 * 69-60 : D
		 * 59-0 :  F
		 * 
		 */
		int NumericGrade = -10;
		String LetterGrade = "";
		if (NumericGrade>=90 && NumericGrade<=100) {
			LetterGrade = "A";
		}
		else if (NumericGrade>=75 && NumericGrade<=100) {
			LetterGrade = "B";
		}
		else if (NumericGrade>=70 && NumericGrade<=100) {
			LetterGrade = "C";
		}
		else if (NumericGrade >=60 && NumericGrade<=100) {
			LetterGrade = "D";
		}
		else if(NumericGrade>=0 && NumericGrade<=100){
			LetterGrade = "F";
		}
		else {
			System.out.println("Invalid Input");
		}
		System.out.println(LetterGrade);
		
		
		
		
		
	}

}
