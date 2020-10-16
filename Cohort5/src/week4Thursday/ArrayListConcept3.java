package week4Thursday;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListConcept3 {

	public static void main(String[] args) {
		
		// Ask inputs from the user and store inside of arraylist
		ArrayList<String> arrayList = new ArrayList<>();
		
		Scanner scanner = new Scanner(System.in);
		
		// Create a program which ask user if he wants to add more values or not.
		// If user enter yes, then get the value, put inside of the arraylist
		// If user says no, break the loop
		
		while (true) {
			
			System.out.println("Do you want to add more values ?");
			String answer = scanner.next();
			if (answer.equals("yes")) {
				System.out.println("What is the value : ");
				String value = scanner.next();
				arrayList.add(value);
			}
			else if (answer.equals("no")) {
				break;
			}
			else {
				System.out.println("Invalid Answer");
			}
			
		}
		System.out.println(arrayList);
		
		/*
		 * Sample output : 
		 * Do you want to add more values ? 
		 * yes
		 * What is the value ? : 
		 * Ahmet
		 * Do you want to add more values ? 
		 * no
		 * [Ahmet]
		 * 
		 */
	}

}
