package week4Tuesday;

import java.util.Scanner;

public class LoopReview {

	public static void main(String[] args) {
		
		// Loops are useful for executing some group of statements more than one time
		
		// For Loop, While Loop, Do While Loop, For Each Loop
		
		// 0,1,2,3,4
		for(int i = 0; i< 5; i++ ){
			// Statements
			System.out.println(i);
		}
		
		// While Loop 
		
		Scanner scanner = new Scanner(System.in);
//		while(true){
//			if (scanner.next().equals("Stop")) {
//				break; // Stop the loop
//			}
//		}
		
		System.out.println("Hello");
		
		// Do while loop : It is working one time if the condition is false. 
		
		do {
			System.out.println("Do While");
		} while (false);
		
		

	}

}
