package week2Tuesday;

public class ElseIfBlocks {

	public static void main(String[] args) {
		
		boolean myVariable = true;
		
		// In the conditional programs, if we have true condition
		// the first true conditioned block is going to work. 
		// IF there is no true condition, else block is going to work
		
		System.out.println("START");
		
		if (false) {
			System.out.println("IF BLOCK");
		} 
		else if(false){
			System.out.println("FIRST ELSE IF");
		}
		else if (true){
			System.out.println("SECOND ELSE IF");
		}
		else {
			System.out.println("ELSE BLOCK");
		}

		System.out.println("END");
		
	}

}
