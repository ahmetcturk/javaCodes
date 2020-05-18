package week4;

public class FindingEvenNumbers {

	public static void main(String[] args) {
		
		// Finding the even numbers in array
		int array [] = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i = 0; i < array.length; i++){
			if (array[i] % 2==0) {
				System.out.println(array[i]+" : Even");
			}
			else {
				System.out.println(array[i]+" : Odd");
			}
		}
		
		

		
	}

}
