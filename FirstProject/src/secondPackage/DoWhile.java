package secondPackage;

public class DoWhile {

	public static void main(String[] args) {
		// Welcome Silicone Lab's Brilliant Students
		// Code Hard, Study Hard !
		
		// While vs Do While
		/*
		 *  Difference : do while block will be executed 
		 *  at least one time, even if the condition is false
		 */
		
		boolean check = true;
		while (check) {
			//System.out.println("Hello Silicone Labs");
			check = false;
		}
		
		boolean check2 = false;
		do {
			//System.out.println("This is my do while loop !");
		} while (check2);
		
		
		int count = 0 ; 
		do {
			System.out.print(count);
			count++;
		} while (count>44);
		
	}

}
