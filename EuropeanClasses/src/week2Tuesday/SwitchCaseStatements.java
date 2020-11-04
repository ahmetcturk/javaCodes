package week2Tuesday;

public class SwitchCaseStatements {

	public static void main(String[] args) {
		/*
		 * Switch case vs if else : 
		 * in switch case, multiple cases can be executed at the same time
		 * in switch case, program only checks equality of the key and value
		 */
		// key, value
		// switch case statements are special blocks 
		// which runs only if key and value would be equal
		
		int key = 90;
		switch (key) {
		case 90:
			System.out.println("This is case");	
			break;
		case 4: 
			System.out.println("This is case 2");
			break;
		case 5: 
			System.out.println("This is case 3");
			break;
		default: 
			System.out.println("This is default");
			
		}
		
		
		

	}

}
