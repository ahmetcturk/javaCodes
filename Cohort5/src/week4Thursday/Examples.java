package week4Thursday;

import java.util.Arrays;

public class Examples {

	public static void main(String[] args) {
		
		String str = "how, you, doing, house, the, out, java, coffee, cat, ray";
		String [] arr = str.split(", ");
		System.out.println(Arrays.toString(arr));
		
		String shortest = arr[0];
		String evenlyShorts = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() < shortest.length()) {
				shortest = arr[i];
			}
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() == shortest.length()) {
				evenlyShorts += arr[i] + " ";
			}
		}
		
		System.out.println(evenlyShorts);
		
		String []shortArray = evenlyShorts.split(" ");
		
		System.out.println(Arrays.toString(shortArray));
	}

}
