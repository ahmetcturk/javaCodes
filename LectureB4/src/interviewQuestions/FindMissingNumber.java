package interviewQuestions;

public class FindMissingNumber {

	public static void main(String[] args) {
		
		int arr[] = {3,4,6,7}; 
		
		int sumExpected = 0;
		for (int i = arr[0]; i <= arr[arr.length-1]; i++) {
			sumExpected += i;
		}
		
		System.out.println(sumExpected);
		
		int sumActual = 0;
		for (int i = 0; i < arr.length; i++) {
			sumActual += arr[i];
		}
		
		System.out.println("Missing number : " + ( sumExpected-sumActual));
		
		
	}
	
}
