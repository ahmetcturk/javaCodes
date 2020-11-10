package week3Tuesday;

public class ForLoopConcept {

	public static void main(String[] args) {
		
		//  0, 1, 2, 3, 4, 5, 6, 7, 8, 9
		for (int i = 0; i < 10; i ++) {
			System.out.print("Hello" + " " );
		}
		
		System.out.println(); // Creates a line
		
		// 0, 1, 2, 3, 4
		for (int i = 0 ; i < 5 ; i++){
			System.out.print(i + " ");
		}
		System.out.println(); // Creates a line
		
		for (int i = 0; i < 4; i++) {
			System.out.println(i + " Hello");
		}
		
		// We use for loop to handle the arrays
		int [] array = {98,1,2,3,4,5,6};
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		
		// Print out numbers from 5-1
		// 5, 4, 3, 2, 1
		for(int i = 5; i >=1 ; i-- ){
			System.out.println(i);
		}
		
		// Small Challenge : Print numbers from 10-0, decrease numbers by 3
		// 10, 7 , 4, 1 
		for(int i = 10; i >= 0 ; i -= 3){
			System.out.println(i);
		}
		
		// Create a multiplication Table
		/*
		 * 5*0 = 0
		 * 5*1 = 5
		 * 5*2 = 10
		 * 5*3 = 15
		 * ...
		 * 5*10 = 50
		 */
		
		// 0,1,2,3,4,5,6,7,8,9,10
		for(int i = 0 ; i <= 10 ; i++){
			System.out.println("5*" + i + " = " + (5*i) );
		}
		
		
		
		
		
		
		
	
	}

}
