package week3Thursday;

public class ForLoopExamples8 {

	public static void main(String[] args) {
		
		// How to find duplicated elements in array
		
		int arr[] = {1,2,3,4,5,6,7,8,3};
		
		for(int i = 0; i<arr.length ; i++){
			for(int j = i+1; j< arr.length; j++ ){
				if (arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
		
		

	}

}
