package week3;


import java.util.Scanner;

import javax.security.auth.x500.X500Principal;
import javax.xml.transform.Templates;

public class WhiteBoard {

public static void main(String[] args) {
		




	
	// Math.random() normally returns double values 0.0-1.0
	// Step 1 : Create a random generator which returns number 0-1
	// Step 2 : If answer is 1, return "yes", if 0, return "no"
//	for (int i = 0; i < 100; i++) {
//		int randomValue = (int) (0.5 + Math.random());
//		if (randomValue ==1) {
//			System.out.println("Yes");
//		} else {
//			System.out.println("No");
//		}
//		}
	
//	Scanner keyboard = new Scanner(System.in); 
//	
//	int x = 1;
//	do {
//		
//		System.out.print("Enter a number: ");
//		
//		x = keyboard.nextInt(); 
//	}
//	while (x > 0);
	
//	Scanner keyboard = new Scanner(System.in); String input;
//	 char sure = 0;

	 								
//	 while (sure != 'Y' && sure != 'N'){
//		 System.out.print("Are you sure you want to quit? "); input = keyboard.next();
//		 sure = input.charAt(0);
//								
//		}
	 
	
//	int x = 50 ;
//	 while (x>0) {
//		 System.out.println(x + " seconds to go.");
//		x--;
//	}
//	
		

//	Scanner scanner = new Scanner(System.in);
//	String arr1[] = {"Rent", "Insurance", "Fuel", "Food", "Other Stuffs"};
//	int totalCost = 0; 
//	for (int i = 0; i < arr1.length; i++) {
//		System.out.println("How much did you pay for " + arr1[i] + " : ");
//		int cost = scanner.nextInt();
//		
//		totalCost += cost;
//		
//	}
//	if (totalCost > 2000) { // let's say his/her monthly budget is 2000
//		System.out.println("You spent " + totalCost+"\nYou are over your budget");
//	} else {
//		System.out.println("You spent " + totalCost+"\nYou are still under your budget");
//	}
//	Scanner scanner = new Scanner(System.in);
//	int sum = 0;
//	System.out.println("Put the number : ");
//	int number = scanner.nextInt();
//	// First Solution
//	for (int i = 0; i <= number; i++) {
//		sum += i;
//	}
//	System.out.println("Total sum of number from 0 - " + number + " : " + sum);
//	
//	// Second Solution for math geeks
//	int sum1 = number*(number + 1)/2;
//	System.out.println("Total sum of number from 0 - " + number + " : " +sum1);
//	
//	Scanner scanner = new Scanner(System.in);
//	int sum = 0; // total salary is 0 initially
//	int salary = 1; // starts with 1 penny
//	
//	boolean repeater = true;
//	while (repeater) {
//		System.out.println("Put the number of days you worked : ");
//		int number = scanner.nextInt();
//		if (number >= 1) {
//			for (int i = 1; i <= number; i++) {
//				salary = (int) Math.pow(2, i - 1);
//				sum = sum + salary;
//				
//			}
//			System.out.println("Salary at day " + number + " = " + salary);
//			System.out.println("Salary until that day : " + sum);
//			
//		} else {
//			System.out.println("Invalid number");
//		} 
//	}
//	
//	int [][]a = new int[10][10];   
//	 for(int i = 0; i < 10; i++)
//	  {
//	   for(int j = 0; j < 10; j++)
//	   {
//	     System.out.printf("%2d", a[i][j]);
//	   }
//	   System.out.println();
//	  }
	
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input the first number: ");
//        double x = in.nextDouble();
//        System.out.print("Input the Second number: ");
//        double y = in.nextDouble();
//        System.out.print("Input the third number: ");
//        double z = in.nextDouble();
//        //System.out.print("The smallest value is " + smallest(x, y, z)+"\n" );
//        smallest(x, y, z);
//        double smallestV = Math.min(Math.min(x, y),z);
//        System.out.println(smallestV);
	
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double x = in.nextDouble();
        System.out.print("Input the second number: ");
        double y = in.nextDouble();
        System.out.print("Input the third number: ");
        double z = in.nextDouble();
        System.out.print("The average value is " +"\n" );
        average(x, y, z);
}  

  public static void average(double x, double y, double z)
    {
        System.out.println((x + y + z) / 3);
    }
    


// Let's create a method for this
public static void smallest(double x, double y, double z)
{
    System.out.println(Math.min(Math.min(x, y), z));
}


}
