package week5;

public class SmallGroup {

	public static  void arrayChecker(int[] arr) {
		// methods increase code reusability
		System.out.println("Finding duplicate elements in array using brute force method"); 
		for (int i = 0; i < arr.length; i++) { 
			for (int j = i + 1; j < arr.length; j++) { 
				if (arr[i]==arr[j]) {
					// got the duplicate element 
					System.out.println(arr[j]);
			}
		}
	}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(signChecker(9));
		int arr[] = {9,9,8,7,6,5,4,3,2,1,9};
		int arr1[] = {9,9,8,7,6,5,4,3,2,1};
		arrayChecker(arr1);
		arrayChecker(arr);
		//System.out.println(signChecker(9));
		/*
		 * Question1 Write a method called checkNumber with an int parameter
		 * number The method should not return any value, and it need to print
		 * out:"positive" if the parameter number is > 0 "negative" if the
		 * parameter number is < 0 "zero" if the parameter number is equal to 0
		 */
		
		
		


	}

}
