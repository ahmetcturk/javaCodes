package week4;

public class TwoDimensionalArrays {

	public static void main(String[] args) {
		
// Two dimensional array : 
// Having an array as an array element
		
		
		int [][] array1 = {{1,2},{2,2},{3,6},{4,5}};

		// for each loop
		// for each loops is a special loop for printing lists
		for (int[] outerArray : array1) {
			for (int innerArray : outerArray) {
				//System.out.println(innerArray + " ");
			}
			//System.out.println();
		}
		
		// nested for loop
		
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(array1[i][j] + " ");
			}
			System.out.println();
		}
		
		// How to print specific elements in two dimensional arrays
		//System.out.println(array1[3][1]);
		
	}

}
