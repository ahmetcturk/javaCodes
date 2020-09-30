package week2Tuesday;

public class IfBlocks {

	public static void main(String[] args) {
		
	// this is block only controls first statement because there is no curly bracelets
	if(false)	
	System.out.println("Inside of the if block");
	System.out.println("Outside of the if block");
	
	// If block use curly bracelets, 
	// it can control all the statements inside of that curly bracelet
	
	boolean myBoolean = false;
	if(myBoolean){
		System.out.println("Inside of the 2nd if block ");
		System.out.println("Hello Silicone labs");
	}
	
	
	int number = 100;
	
	if (9<=0) {
		number = 1;
	}
	
	System.out.println(number);
	
	
	int a = 8;
	int b = 9;
	
	if(a == b){
		System.out.println("This is inside of the if block");
	}
	
	
	int age = 21;
	
	if(age >= 18){
		System.out.println("You can vote");
	}
	
	System.out.println("==============================");
	
	int first = 10;
	int second = 99;
	
	if(first > second){
		System.out.println("First variable is greater than second variable");
	}
	
	if(second > first){
		System.out.println("Second variable is greater than first variable");
	}
	
	
	
		
	}

}
