package week3Tuesday;

public class ForLoopConcept2 {

	public static void main(String[] args) {
		
		// Create a program which prints out number which ends with 8;
		int [] array = {18,22, 33, 38, 98, 99};
		for (int i = 0; i < array.length; i++) {
			if (array[i]%10 == 8) {
				System.out.println(array[i]);
			}
		}
		
		// Print array in reverse order
		// 5, 4, 3, 2, 1, 0
		for (int i = array.length - 1 ; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
		
		
		
		// For Loop
		
		int i = 0; 
		for (; i <= 5; i++) {
			System.out.println(i);
		}
		
		// Printing alphabetic characters a-z
		
		// a, b, c, ...., z
		for(char character = 'a'; character<='z'; character++){
			System.out.println(character);
		}
		
		

	}

}
