package week3Tuesday;

public class ContinueStatement {

	public static void main(String[] args) {
		// continue
		
		// We are using continue statement in order the skip that statement
		
		// Create a program which prints all the elements except 5
		
		int arr [] = {5,5,5,5,1,2,3,45,5,6,7,8,98};
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 5) {
			//	System.out.println(arr[i]);
			}
		}
		
		// Continue
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 5) {
				continue;
			}
			System.out.println(arr[i]);
		}
		
		// Create a program which print only odd numbers from 0-10, use continue statement
		for (int i = 0; i < 10; i++) {
			if (i%2==0) {
				continue;
			}
			System.out.println(i);
		}
		
		
		

	}

}
