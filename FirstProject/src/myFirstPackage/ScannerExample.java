package myFirstPackage;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// Welcome Silicone Lab's Brilliant Students
		// Code Hard, Study Hard !
		
		// In order to get input from user, we will use scanner object
		
		// Scanner = A class in Java API 
		Scanner scanner = new Scanner(System.in); // scanner = identifier, it can be in any name
		// We will create another variable to hold our data from user
		System.out.println("Please enter your name : ");
		
		String string = scanner.nextLine();
		
		System.out.println("Please enter your lastname : ");
		
		String lastname = scanner.nextLine();
		
		System.out.println("Please enter your age : ");
		
		int age = scanner.nextInt();
		
		System.out.println("Your name : " +string + 
				"\nLastname : " + lastname +
				"\nAge : " + age);
		
	      
		

	}

}
