package ReviewPackage;

public class LoopsExample1 {

	// We can do every task with every loops
	public static void main(String[] args) {
		
		// Can you print out number starting from 0-100 ? 
		
		for (int i = 0; i < 101; i++) {
			if (i%2==0) {
				//System.out.println("Even Numbers : " +i);
			} else {
				//System.out.println("Odd Numbers : " +i);
			}
		}
		
		
		// do while loops
		
		int a = 0;
		do {
			//System.out.println(a);
			a++;
		} while (a<101);

		
		// Switch from do while loop to while loop
		
		int b = 0;
		while (b<101) {
			System.out.println(b);
			b++;
		}
	}

}
