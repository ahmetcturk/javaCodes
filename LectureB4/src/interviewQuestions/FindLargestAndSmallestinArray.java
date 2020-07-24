package interviewQuestions;

public class FindLargestAndSmallestinArray {
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,6,7,8,999,1,2};
		
		// Find Largest int in array
		
		int largest = arr[0];
		int smallest = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			} else if(arr[i] < smallest) 
			{
				smallest = arr[i];
			}
		}
		
		System.out.println("Smallest : " + smallest);
		System.out.println("Greatest  : " + largest);
		
		
		
		

	}
}
