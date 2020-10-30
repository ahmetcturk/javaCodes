package week1Thursday;

public class J_3_IfElseOverview {

	public static void main(String[] args) {
		
		// In the if else blocks, either if or else block will be executed
		// Not both them at the same time
		
		boolean myBoolean = true;
		
		if (!myBoolean) {
			System.out.println("Hello from if block");
		} else {
			System.out.println("Hello from the else block");
		}
		
		
		int a = 98;
		int b = 98;
		
		if (a == b) {
			System.out.println("integers are equal");
		} else {
			System.out.println("integers are not equal");
		}
		
		
		// We will create a program which changes my integer 
		// *2 if boolean is true
		// *3 if boolean is false
		
		int number = 9;
		
		boolean value = false;
		
		System.out.println(number);
		
		if (value) {
			number = number*2;
		} else {
			number = number*3;
		}
		
		System.out.println(number);
		
		
		

	}

}
