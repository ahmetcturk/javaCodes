package week2;

public class IfElseBlocks {

	public static void main(String[] args) {
		
		// In If else blocks, either if, or else block if going to work
		// Not both of them is going to work at the same time
		
		boolean myBoolean = true;
		
		
		if(myBoolean){
			System.out.println("Hello from if block");
		}
		else{
			System.out.println("Hello from else block");
		}
		
		int a = 9 ;
		int b = 20;
		
		if(a == b){
			System.out.println("Variable a is equals to b");
		}
		else{
			System.out.println("Variable a is not equals to b");
		}
		
		
		/* We will create a program changes my integer 
		 * and multiply it with 2 if condition is true
		 * if condition is false, it multiplies it with 3
		 */
		int myInt = 100;
		
		System.out.println("This is my integer before if else block : " + myInt);
		
		boolean check = false;
		if(check){
			myInt = myInt * 2;
		}
		else {
			myInt = myInt * 3;
		}
		
		System.out.println("This is my integer after if else block : " + myInt);
		
		
		
		
	}

}
