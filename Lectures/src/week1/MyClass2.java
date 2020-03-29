package week1;

import java.util.Scanner;

public class MyClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Boolean Logic : or - and
		//  && - and  IF left side and right side is true, then it is going to be true	
		//  || - or IF one of the left side or right side is true, then it is going to be true
		
		System.out.println(1%3);
		System.out.println(true && true);
		System.out.println(true && false);
		boolean userName = true;
		boolean password = false;
		System.out.println(userName && password);
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || false || false || false || true);
		System.out.println("Or Operator : " + (true || true));
		
		System.out.println("And Operator : "  + (true && (false || 9<0 || 9>8)));
		
		// Narrowing casting
		double GPA = 3.8;
		int GPA1 = (int)GPA;
		System.out.println(GPA1);
		
		float myFloat = 7.88f;
		int myInteger = (int)myFloat;
		System.out.println(myFloat);
		System.out.println(myInteger);
		
		// Widening Casting -- Automatic process
		int myInt = 90;
		double myDouble = myInt;
		System.out.println(myDouble);
		System.out.println(myInt);
		
		
		int num1 = 2;
		int num2 = 8;
		System.out.println((double)num1/num2);
		
		int sum1 = num1 + num2;
		System.out.println(sum1/2);
		
		// Finding the average
		double sum = num1 + num2;
		System.out.println(sum/2);
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your first name ? : ");
		String input = scanner.nextLine(); // nextLine taking string values
		System.out.println("My name is : " + input + " Turk");
		
		
		System.out.println("What is your age ? : ");
		int input2 = scanner.nextInt(); // nextInt taking integer values
		System.out.println("My age is : " + input2 );
		
		System.out.println("What is your GPA ? : ");
		double input3 = scanner.nextDouble(); // nextDouble taking double values
		System.out.println("My gpa is : " + input3 );
		
		
		// Ask user for Year of birth and calculate the age
		// age = 2020 - yearOfBirth
		
		System.out.println("What is your year of birth ? : ");
		int input4 = scanner.nextInt(); // nextInt taking integer values
		System.out.println("Your age is : " + (2020-input4) );
//		
		
		// Ask for two numbers from the user, find the division of those two numbers
		
		System.out.println("What is first number : ");
		double firstNumber = scanner.nextDouble(); 
		
		System.out.println("What is second number : ");
		double secondNumber = scanner.nextDouble(); 
		System.out.println("This is the division of two numbers : " + (firstNumber/secondNumber));
		

		
		
		
	}

}
