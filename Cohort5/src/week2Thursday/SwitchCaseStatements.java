package week2Thursday;

public class SwitchCaseStatements {

	public static void main(String[] args) {
	
		// Create key : int, String, char
		// Switch vs If-Else : multiple cases can execute at the same time
		// Switch case only checking key-value equality, but if else block can check
		// much more complex boolean expressions
		
		
		int key = -9;
		
		switch (key) {
		case 9:
			System.out.println("Case 1");
			break;
		case 8: 
			System.out.println("Case 2");
			break;
		case 100:
			System.out.println("Case 3");
			break;
		default: 
			System.out.println("Default");
		}

	}

}
