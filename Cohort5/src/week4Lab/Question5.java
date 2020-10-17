package week4Lab;

public class Question5 {

	public static void main(String[] args) {
		/*
		 * 
		
		******* 
		****** 
		***** 
		**** 
		***						
		** 
		* 
		
		 */
		// 5,4,3,2
		for (int i = 5; i >= 1; i--) {
			//0,1,2,3,4
			//0,1,2,3
			//0,1,2
			//0,1
			//0
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
