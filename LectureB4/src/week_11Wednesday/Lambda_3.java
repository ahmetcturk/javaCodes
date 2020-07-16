package week_11Wednesday;

import java.util.ArrayList;
import java.util.Arrays;

public class Lambda_3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4));
		
		// Print all the elements
		arrayList.forEach(i -> System.out.print(i));
		
		System.out.println();
		
		// Print only even numbers
		arrayList.forEach(n -> {if(n%2 ==0)System.out.print(n);});
		

	}

}
