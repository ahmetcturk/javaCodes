package secondPackage;

public class TwoDimensionalArrays {

	public static void main(String[] args) {
		// Welcome Silicone Lab's Brilliant Students
		// Code Hard, Study Hard !
		// 3 ways to print out two dimensional array with for loop
		
		int[][] arr = {{ 1,2,3 },{4,5,6},{7,8,9}}; 
		
		// for each
		
		for (int[] is : arr) {
			for (int i : is) {
				//System.out.print(i + " ");
			}
			//System.out.println();
		}
	  
	    // Loop trough 2d array with for loop, temporary array
		for (int i = 0; i < arr.length; i++) {
			int[] js = arr[i];
			for (int j = 0; j < js.length; j++) {
			//	System.out.print(js[j] + " ");
			}
			//System.out.println();
		}
		
		
		// for loop
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
