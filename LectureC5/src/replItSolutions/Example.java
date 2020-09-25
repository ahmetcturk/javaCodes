package replItSolutions;

import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		String arr[] = {"Hey", "There"};
		swap(arr, 0, 1);
		System.out.println(Arrays.toString(arr));
		
		
		

	}
	
	public static <T> void swap(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
