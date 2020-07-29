package interviewCoding_1;

import java.util.Arrays;

public class FindTwoMaximumNumbers {
	
	public static void main(String[] args) {
		
		// Find two maximum numbers from the array
		int arr1[] = {1,2,3,4,5,6,7,8};
		
		// Sort the array
		
		Arrays.sort(arr1);
		
//		System.out.println(arr[arr.length-1]);
//		System.out.println(arr[arr.length-2]);
		
		int arr[]={1,2,3,8,5,7,6};
		int max1=0;
		int max2=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max1){
				max1=arr[i];
			}
			if( arr[i]> max2 && arr[i]<max1){
				max2=arr[i];
			}
		}
		System.out.println(max1);
		System.out.println(max2);
	
		
		
	}

}
