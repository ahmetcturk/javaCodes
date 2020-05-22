package week4;

import java.util.Arrays;

public class Recab2 {

	public static void main(String[] args) {
		
		// Two dimensional arrays 
		// Arrays inside of an array

		//                        0   1   2     0   1   2     0   1      0   1   2      
		char[][] character2D = {{'X','Y','Z'},{'A','B','C'},{'D','F'}, {'A','C','T'}};
		//                        ---------     ---------     ------    ------------
		//                            0             1            2            3
		
		System.out.println(character2D[3][1]);
		
		// Arrays.deepToString(array[][])
		System.out.println(Arrays.deepToString(character2D));
		
		// for each 
		for (char[] cs : character2D) {
			for (char c : cs) {
			//	System.out.println("'"+c + "'");
			}
		}
		
		// array is holding elements in data type of int arrays
		// elements of this array is holding elements in data type of int
		int [][] array = {{1,1,2,3},{2,3,4},{3,5,6},{4,7,8},{5,9}};
		
		for (int[] elementsInOuterArray : array) {
			for (int innerArrayElements : elementsInOuterArray) {
				System.out.print(innerArrayElements);
			}
		}
		
		
		
		
		
	}

}
