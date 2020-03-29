package week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;
import javax.xml.ws.AsyncHandler;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class SmallGroup2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//question
//		String str=50+30+ 55+"Hello world"+40+40;
//		System.out.println(str);
//	//how can we make arithmetic operation with string
//		
//
		
		
		
//		  Create a login system and check exact password and username
//		  Variables:
		  String secretUserName = "a";
		  String secretPassword = "b";
//		  > Make sure that they match with secret ones and allows login successfully
//		  > Whenever login is not successful, let program tell exact reason
//		  > Why it is not valid
//		   --> username is not valid
//		   --> password is not valid
//		   --> both username and password 
//		  Scanner scanner = new Scanner(System.in);
//		  System.out.println("Put your username : ");
//		  String userInput = scanner.nextLine();
//		  System.out.println("Put your password : ");
//		  String passwordInput = scanner.nextLine();
//		  
//		  if (secretUserName.equals(userInput)) {
//			if (secretPassword.equals(passwordInput)) {
//				System.out.println("You can login successfuly");
//			}
//			else {
//				System.out.println("Your password is wrong");
//			}
//		} else {
//			if (!secretPassword.equals(passwordInput)&&!secretUserName.equals(userInput)) {
//				System.out.println("Both is wrong");
//				
//			} else {
//				System.out.println("Your username is wrong");
//			}
//		}
//		  
		  
		  
		  //Interview question(how to calculate in a string)
			
//		  String s2 = "Your total amount is 1500 USD";
//			
//		 String total = s2.substring(21, s2.indexOf("USD")-1);
//		 System.out.println(total);
//			
//		 int totalValue = Integer.parseInt(total);
//			
//		 System.out.println(totalValue+100);
		 //		 System.out.println("1" + "2");
		 //		 System.out.println(Integer.parseInt("1") + Integer.parseInt("2"));
		 //		 System.out.println(1+2);
		 
		 //Mr turkmen mentioned this subject in recap.but it is not clear 
		 //in my mind.what is this parselnt exactly?could you please explain?
		 
//		  int [] source = {1,2,3,4,5,6,7,8};
//		  
//		  for (int i = 0; i < source.length; i++) {
//			System.out.println(source[i]);
//		}
		  
		  

//				  Scanner scanner = new Scanner(System.in);
//				  			System.out.print("Input the first number: ");
//				  	     double x = scanner.nextDouble();
//				  	    System.out.print("Input the second number: ");
//				  	     double y = scanner.nextDouble();
//				  	    System.out.print("Input the third number: ");
//				  	     double z1 = scanner.nextDouble();
//				  	    System.out.print("The average value is " +"\n" );
//				  		  System.out.println((x + y + z1) / 3);
				  
		  
		  
	//	  int[] nums = {100,234,311,5433,6454,1233,54523,45645,1234};
//		  int sum = 0;
//		  int sumOfEvens = 0;
//		  int sumOfOdds = 0;
//		  	for (int i = 0; i < nums.length; i++)
//		  	{
//		  	 sum = sum + nums[i]; // Hint : how to find the sum of all numbers // sum +=nums[i]
//		  	 if (nums[i]%2==0) { // parity : oddness or evenness: 
//		  		sumOfEvens = sumOfEvens + nums[i]; // sumOfEvens +=nums[i]
//			} else {
//				sumOfOdds = sumOfOdds + nums[i];
//			}
//		  }
//		  	System.out.println(sum);
//		  	System.out.println(sumOfEvens);
//		  	System.out.println(sumOfOdds);
//		  
		  
		  
//		  int[] nums = {100,234,311,5433,6454,1233,54523,45645,1234};
//		  
//		  ArrayList<Integer> arrayList = new ArrayList<>();
//		  for (int i = 0; i < nums.length; i++) {
//			arrayList.add(nums[i]);
//		}
//		
//		  System.out.println(arrayList);
		  
//		  int luckyNumber = 7;
//		  for (int i = 0; i < 10; i++) {
//			  int randomNumber = (int)(Math.random()*100);
//			  System.out.print(randomNumber);
//			if (randomNumber == luckyNumber) {
//				System.out.println();
//				System.out.println("$5000");
//			} 
			//turkmen
			//
		//}
		  
		  
		/* 
			- Calculate credit score (if else)
		   1- 299 Bad credit score
		   2- 300 - 379 very poor score --> %16
		   3- 380 - 669 fair credit score --> %18
		   4- 670 - 739 good credit score --> %21
		   5- 740 - 799 very good score --> %25
		   6- 800 - 850 Excellent score --> %20
		   */
		  
//		  Scanner scanner = new Scanner(System.in);
//		  System.out.println("What is your credit score  ? : ");
//		  int creditScore = scanner.nextInt();
//		  if (creditScore <= 850 && creditScore >= 800 ) {
//			System.out.println("Excellent score " + " %20 ");
//		} 
//		  else if (creditScore <= 799 && creditScore >= 740 ) {
//			  System.out.println("very good score");
//			}
//		  else if (creditScore >= 739 && creditScore >= 670 ) {
//			  System.out.println("good score");
//			}
//		  else if (creditScore >= 669 && creditScore >= 380 ) {
//			  System.out.println("fair score");
//			}
//		  else if (creditScore >= 379 && creditScore >= 300 ) {
//			  System.out.println("very poor ");
//			}
//		 else {
//				System.out.println("bad" );
//		}
		  
//		  int number = 100;
//		  int percentage = 80;
//		  int total = (number*percentage)/100;
//		  System.out.println(total);
		 // System.out.println(helloWorld());
		
	}
	static void checkAge(int age) {

	    // If age is less than 18, print "access denied"
	    if (age < 18) {
	      System.out.println("Access denied - You are not old enough!");

	    // If age is greater than 18, print "access granted"
	    } else {
	      System.out.println("Access granted - You are old enough!");
	    }

	  }
}
