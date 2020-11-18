package week3Saturday;

public class DoWhileLoop {

	public static void main(String[] args) {
		/*
		 * Do while loop is working very similar with while loop
		 * Difference is : 
		 * Do while loop will execute one time if condition is false
		 * While will not execute if condition is false
		 */
		
		int i = 1;
		do{
			System.out.println(i);
			i --;
		}while(i>-5);
		
		// print array element with do while loop
		int [] arr = {9,8,7,8};
		
		int index = 0; 
		do {
			System.out.println(arr[index]);
			index ++;
		} while (index <arr.length );
		
		
		

	}

}
