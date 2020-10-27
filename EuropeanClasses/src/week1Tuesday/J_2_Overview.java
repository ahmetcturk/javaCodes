package week1Tuesday;

public class J_2_Overview {

	public static void main(String[] args) {
		
		// If Blocks : We are creating decision making programs with if blocks
		
		if(false)
		System.out.println("Hello Silicone Labs");
		
		// If blocks are affecting only one statement unless we use curly bracelets
		
		if(false){
		System.out.println("1");
		System.out.println("2");
		}
		
		
		boolean check = true;
		
		if(check){
			System.out.println("Check");
		}
		
		System.out.println("This is the end of the if block");
		
		
		if(9!=8){
			System.out.println("Condition as an expression");
		}
		
		
		if(true && true){
			System.out.println("9");
			System.out.println("8");
		}
		
		// Example 1 
		
		if (5>6 && 6<9) {
			System.out.println("Java Class");
		}
		
		
		// Example 2
		boolean myBoolean1 = true, myBoolean2 = false;
		
		if (!(myBoolean2 || myBoolean1)) {
			System.out.println("Example 2");
		}
		
		// Example 3
		
		int a = 9;
		
		if (false) {
			a += 90; // a = a + 90
			a += 90; // a = a + 90
		}
		
		System.out.println(a);
		
		// Check if the first number is lower than or equal to second number
		int first = 1;
		int second= 10;
		
		if(first <= second){
			System.out.println("First number is lower than or equal to second number");
		}
		
		if (first > second) {
			System.out.println("First number is greater than to second number");
		}
		
		
		

	}

}
