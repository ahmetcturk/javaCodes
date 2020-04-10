package week10;

import java.util.Scanner;

//Java program to demonstrate working of throws 
public class ExceptionHandlingConcept {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		
			try{
				System.out.println("Input your year of birth");
				int year = scanner.nextInt();
				int age = 2020 - year;
				System.out.println("This is your age : " + age);
			}
			catch (Exception e) {
				System.out.println("Invalid input");
			}
		
		
		
		
		
		
		
		
		
	}

}
