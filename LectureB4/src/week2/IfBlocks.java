package week2;

import java.time.temporal.IsoFields;

public class IfBlocks {

	public static void main(String[] args) {
		
		
		if(false)
		System.out.println("Hello Silicone Labs");

		// If blocks are affecting only one statement unless we use Curly braces
		if(false)
		System.out.println("Hello Silicone Labs 1 ");
		System.out.println("Hello Silicone Labs 2");
		
		
		if(true){
		System.out.println("Hello Silicone Labs 3 ");
		System.out.println("Hello Silicone Labs 4");
		}
		
		boolean myBoolean = false;
		
		if(myBoolean){
		System.out.println("Hello Silicone Labs 5");
		}
		
		int a = 9;
		int b = 9;
		// Expression as condition
		if(a>=b){
		System.out.println("Hello Silicone Labs 6");
		System.out.println("Hello Silicone Labs 7");
		}
		
		boolean myBoolean1 = true;
		boolean myBoolean2 = false;
		
		if((myBoolean1&&myBoolean2) || (false || myBoolean1)){
		System.out.println("Hello Silicone Labs 8");
		}
		
		
		// Task in the Slide
		
		int first = 11;
		int second = 10;
		
		// Check if the first number is lower than or equal to second one
		if(first<=second){
		System.out.println("First number is lower than or equal to second one");
		}
		// Check if the first number is greater than second one
		if(first > second){
		System.out.println("First number is greater than second one");
		}
		
		
		
		
		
	}

}
