package week3Tuesday;

public class ArrayExamples {

	public static void main(String[] args) {
		
		// Create a string array and print first two characters of strings(substring(0,2))
		
		String [] arr1 = {"Java", "Eclipse", "Cucumber","zmm"};
		
		for (String string : arr1) {
			
				System.out.println(string.substring(0, 2));
			
		}
		
		// Create a int array and print out + 10 of these integers
		
		int [] arr2 = {1,2,3,4,5};
		
		for (int i : arr2) {
			System.out.print(i + 10 + " ");
		}
		
	}

}
