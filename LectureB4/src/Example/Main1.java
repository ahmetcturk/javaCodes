package Example;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;

public class Main1 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		int arr[] = {1,2,3,4,5};
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		
		long endTime = System.nanoTime();
		long duration = (endTime - startTime);
		
		long startTime1 = System.nanoTime();
		
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		for (int i = 0; i < arr1.size(); i++) {
			arr1.add(i);
		}
		
		long endTime1 = System.nanoTime();
		long duration2 = (endTime1 - startTime1);

		System.out.println("Duration 1 : " + duration);
		System.out.println("Duration 2 : " + duration2);
		
	}

}
