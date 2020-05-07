package week2;

public class ElseIFBlocks {

	public static void main(String[] args) {
		
		// Else if Block (Multiple Selection)
		
		/*
		 * Only one selection blocks is going to be executed
		 * First true conditioned block will be executed
		 */
		
		if(true){
			System.out.println("If Block");
		}
		else if(true){
			System.out.println("First Else If Block");
		}
		else if(false){
			System.out.println("Second Else If Block");
		}
		else{
			System.out.println("Else Block");
		}
		
		
	}

}
