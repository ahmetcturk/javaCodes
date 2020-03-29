package week8;

import java.util.Scanner;

public class myQuestions2
{
	void Fibonacci(Scanner console ){
		/*Write a program to print Fibonacci series of n terms where n is input by user : 
	    0 1 1 2 3 5 8 13 24 ..... **/
	     
	    int number;  
	    int firstTerm = 0,
	      secondTerm = 1,
	      thirdTerm;
	 
	    System.out.print("Enter number of terms of series : ");
	    number = console.nextInt();
	 
	    System.out.print(firstTerm + " " + secondTerm + " ");
	 
	    for(int i = 3; i <= number; i++)
		{
	      thirdTerm = firstTerm + secondTerm;
	      System.out.print(thirdTerm + " ");
	      firstTerm = secondTerm;
	      secondTerm = thirdTerm;
	}}
	void askQuestion(Scanner scanner){
		System.out.println("What is your name : ");
		String answer = scanner.next();
		System.out.println(answer);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		myQuestions2 object1 = new myQuestions2();
		object1.Fibonacci(input);
	
		 
	}
}

