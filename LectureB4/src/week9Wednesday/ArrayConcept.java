package week9Wednesday;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {
		
		// Arrays , fixed size
		String[] rows = {"Silicone", "Labs"};
		
		// Add element to array
		String add = "Students";
		String [] newRows = new String[3];
		for (int i = 0; i < 2; i++) {
			newRows[i]= rows[i];
			
		}
		newRows[newRows.length -1] = add;
		
		System.out.println(Arrays.toString(newRows));
		
		// Removing
		
		// Adding element to specific index
		
		// Removing element from specific index
		
		// Store only unique elements

		// Key value relationship 
	}

}
