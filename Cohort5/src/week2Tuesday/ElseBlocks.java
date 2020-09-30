package week2Tuesday;

public class ElseBlocks {

	public static void main(String[] args) {
		
		// In if else blocks, either if or else block is going to work
		// Not both of them at the same time
		
		if (false) {
			System.out.println("This is inside of if block");
		}
		else{
			System.out.println("This is inside of else block");
		}
		
		
		int age = 20;
		if (age >= 18) {
			System.out.println("You can vote");
		}
		else{
			System.out.println("You can not vote");
		}
		
		
		
		boolean myBoolean = false;
		int variable = 18;
		
		if (myBoolean) {
			System.out.println("IF BLOCK");
			variable = 100;
		} 
		
		else {
			System.out.println("ELSE BLOCK");
			variable = 200;
		}
		
		
		System.out.println(variable);
		
		

	}

}
