package week6;

import java.util.Arrays;

public class Questions {
public static void main(String[] args) {
	
//	String[] arr1 = {"zero", "oneeeee", "two","three","four","keys"};
//	
//
//	int counter = 0;
//	
//for(int j = 0 ; j<arr1.length; j++ ){
//	for (int i = 0; i < arr1[j].length(); i++) {
//		if (arr1[j].charAt(i) == 'e') {
//			counter++;
//		}
//	}
//	
//}
//
//System.out.println(counter);
	
	
	double[] thisYear = { 1.6, 2.1, 1.7, 3.5, 2.6, 3.7, 3.9, 2.6, 2.9, 4.3, 2.4, 3.7 };
	
	double sum = 0;
	for (int i = 0; i < thisYear.length; i++) {
		sum += thisYear[i]; // sum = sum + thisYear[i]
	}
	//System.out.println(sum / thisYear.length);
	
	double maximum = 0;
	for (int i = 0; i < thisYear.length; i++) {
		if (maximum < thisYear[i]) {
			maximum = thisYear[i];
		}
	}
	//System.out.println(maximum);
	
	double minimum = thisYear[0];
	for (int i = 0; i < thisYear.length; i++) {
		if (minimum > thisYear[i]) {
			minimum = thisYear[i];
		}
	}
	System.out.println(minimum);
	Arrays.sort(thisYear);
	System.out.println("Minimum number : " + thisYear[0]);
	System.out.println("Maximum number : " + thisYear[thisYear.length-1]);
	
	
	
	// 

	
	
}
}
