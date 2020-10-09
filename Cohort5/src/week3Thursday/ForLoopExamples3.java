package week3Thursday;

import java.util.Scanner;

public class ForLoopExamples3 {

	public static void main(String[] args) {
		
		// Get a number from user and print the numbers from 0 to user input
		// and increase the numbers by two
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number : ");
		
		int limit = scanner.nextInt();
		
		for(int i = 0 ; i<=limit; i += 2){
			System.out.println(i);
		}
		
		
		// Challenge Print numbers which are divisible by 3 from 1-100 
		
		for(int i = 1; i<=100; i++){
			if(i%3==0){
				System.out.print(i + " ");
			}
		}
		

	}

}
