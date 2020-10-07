package week3Tuesday;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// Two dimensional array : having array inside of an array
		int [][] array1 = {{1,2,3},{2,3,4},{3,4,5},{4,5,6}};
		
		System.out.println(array1[1][1]);
		
	// Outer-Array index		  0		  1		  2      3
		int [][] array2 = {{1,2,3},{2,3,4},{3,4,5},{4,5,6}};
	// Inner-Array index    0 1 2   0 1 2   0 1 2   0 1 2	
		
		System.out.println(array2[3][2]);
		
		
		for (int[] is : array2) {
			for (int i : is) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
		

	}

}
