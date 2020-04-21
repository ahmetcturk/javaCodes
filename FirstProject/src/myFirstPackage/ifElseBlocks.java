package myFirstPackage;

public class ifElseBlocks {

	public static void main(String[] args) {
		// Welcome Silicone Lab's Brilliant Students
		// Code Hard, Study Hard !
		
		// Either if or else block are going to be executed
		// Not Both of them at the same time !!!
		boolean myBoolean = false;
		if (myBoolean) {
			System.out.println("Hello World from if block !!");
		}
		else {
			System.out.println("Hello World from inside of the else block");
		} 
		
		
		
		int a = 9;
		int b = 9;
		
		if (a == b) {
			System.out.println("variable a is equals to variable b");
		} else {
			System.out.println("variable a is not equals to variable b");
		}
		
		
		
		int age = 12;
		// this program will check for age, and if age is greater than equals to 18 
		// it will print out valid age
		// otherwise, it will print out invalid age
		if (age >= 18) {
			System.out.println( age+ " is a valid age");
		} else {
			System.out.println(age + " is not a valid age");
		}

		
		// We will create a program which changes my int value into double if condition is true
		// or it changes the variable into triple
		
		int number = 9;
		boolean check = true;
		
		if (check) {
			number = number *2;
			System.out.println(number);
		} else {
			number = number *3;
			System.out.println(number);
		}
		
		System.out.println(number);
	}

}
