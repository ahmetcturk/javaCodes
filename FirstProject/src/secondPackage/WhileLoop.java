package secondPackage;

import myFirstPackage.ifElseBlocks;

public class WhileLoop {

	public static void main(String[] args) {
		
		// Welcome Silicone Lab's Brilliant Students
		// Code Hard, Study Hard !

		// While loops is being used to iterate statements
		// It is very easy to create infinite loops with while. So be careful
		
		// while(boolean condition){}
		
		int j = 0;
		while (j<5) {
		//	System.out.println(j);
			j++; // without this statement, my loop would be infinite
		}
		//System.out.println(j); // j went up to 5 after while loop
		
		// let's do the reverse
		// j = 5
		
		while (j>0) {
		//	System.out.println(j);
			j--;
		}
		
		//System.out.println("j after second while loop : " + j);
		
		
		// we can loop trough the arrays with using while loop
		int [] arr = {1,4,5,9,6};
		int i = 0;
		while (i<arr.length) { // arr.lenght = 5
		//	System.out.println("index number " + i + " = " + arr[i]);
			i++;
		}
		
		
		// we will create a shape with while loop
/*
	    *
	    **
	    ***
	    ****
	    *****
	    ******
*/
		// Starts are string, and it is increasing by one in every line
		
		String stairs = "";
		int a = 0;
		while (a<4) {
			stairs = stairs + "*";
			//System.out.println(stairs);
			a++;
		}
		
		// break statement : it kills the loop.
		
		int count = 1;
		while (count < 8) {
		//	System.out.println(count);
			break; // this break statement will kill the loop after one repeat
		}
		
		// this program finishes if count2 equals to 5
		int count2 = 1;
		while (count2 < 8) {
			if (count2 == 5) {
				break;
			} 
			System.out.println(count2); 
			count2++;
		}
		System.out.println(count2); // it went up to 5
		
	}

}
