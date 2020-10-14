package week4Tuesday;

public class WhileLoop2 {

	public static void main(String[] args) {
		
		// Print numbers from 10 - 1 with while loop
		
		int i = 10;
		while(i>=1){
			//System.out.println(i);
			i--;
		}
		
		// Challenge : print the values of the array in reverse order
		int arr [] = {1,2,3,4,5,6,7,8,9};
		
		int counter = arr.length - 1;
		
		while(counter >= 0){
			System.out.println(arr[counter]);
			counter -- ; 
		}
		

	}

}
