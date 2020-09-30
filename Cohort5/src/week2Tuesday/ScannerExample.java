package week2Tuesday;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		// Challenge : Ask a year of birth from user and calculate the age of the user
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the year of birth");
		int number = input.nextInt();
		
		System.out.println("Your age is :  " + (2020 - number));
		
		// Ask string value from the user
		System.out.println("Please enter your name : ");
		String name = input.next();
		
		System.out.println("Your name is : " + name);
		
		// Ask for double  (height)
		
		System.out.println("What is your height(meter) : ");
		double height = input.nextDouble();
		System.out.println("Your height is " + height);
		
		
		// Ask for char 
		
		System.out.println("Please enter a character : ");
		char character = input.next().charAt(0);
		System.out.println("This is your character : " + character);
		
		
		
		
		

	}

}
