package week3Tuesday;

import java.util.Arrays;

public class Array2Dime {

	public static void main(String[] args) {
		
		
		
		int [][]x = {{1,2},{2,9},{3,8},{4,7,8}};
		System.out.println(Arrays.deepToString(x));
		
		for (int[] is : x) {
			for (int i : is) {
				System.out.println(i);
			}
		}

	}

}
