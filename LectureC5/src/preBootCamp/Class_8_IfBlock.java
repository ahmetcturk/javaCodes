package preBootCamp;

public class Class_8_IfBlock {

	public static void main(String[] args) {
		
		// if(condition){Statements}
		
	//  Condition as true-false value
		if(true){
		System.out.println("Hello World");
		}
		
	// Condition as boolean variable	
		boolean myBoolean = false;
		
		if (!myBoolean) { // ! changes the boolean to it's reverse
			System.out.println("Silicone Labs");
		}
		
	// Condition as an expression
		
		int a = 9; 
		int b = 9;
		//   true  ||  (false  &&   false)
		if ((a==b) || ((a!=b) && (myBoolean))) {
			System.out.println("variable a equals to b");
		}
		
		
		
		
		
		
		
	}

}
