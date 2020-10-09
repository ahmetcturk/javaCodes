package week3Thursday;

public class ForLoopExamples2 {

	public static void main(String[] args) {
		
		// 0,3,6,9
		for(int i = 0 ; i <= 10 ; i+=3){
			// System.out.println("Hello World");
		}
		
		// Print numbers from 10 - 1 in reverse order
		
		// 10,9,8,7,6,5,4,3,2,1
		for(int i = 10; i>=1; i-- ){
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// Print array with for loop
		//            0 1 2 3 4 5 6
		int [] arr = {1,2,3,5};
		
		// 0,1,2,3
		for(int i = 0; i < arr.length ; i++){
			System.out.print(arr[i]*3 + ",");
		}
		
		
		
		
		
		
		
		
		
		

	}

}
