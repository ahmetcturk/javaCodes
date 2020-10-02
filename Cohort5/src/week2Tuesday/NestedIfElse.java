package week2Tuesday;

public class NestedIfElse {

	public static void main(String[] args) {
		
		boolean myBoolean = true;
		
		if (myBoolean) {
			System.out.println("1");
			
			if (false) {
				System.out.println("2");
				
				if (true) {
					System.out.println("3");
				} else {
					System.out.println("4");
				}
				
			}
			else {
				System.out.println("5");
			}
			
		}
		
		
		
		

	}

}
