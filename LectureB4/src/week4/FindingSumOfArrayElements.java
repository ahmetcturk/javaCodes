package week4;

public class FindingSumOfArrayElements {

	public static void main(String[] args) {
		
		int []array = {1,2,3,4,5,6,7,8,9};
		
		int sum = 0;
		
		int i = 0;
		while (i<array.length) {
			sum = sum + array[i];
			i++;
		}
		
		System.out.println(sum);

	}

}
