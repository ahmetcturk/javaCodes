package week4;

public class NestedForLoops {

	public static void main(String[] args) {
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				//System.out.println(i);
				//System.out.println(j);
			}
		}
		
		// Create a multiplication table with nested for loop
		
		for (int i = 1; i < 10; i++) {
			for (int j= 1; j < 10; j++) {
				System.out.print(i*j + " ");
			}
			System.out.println();
		}
		
	}

}
