package week4Lab;

public class Question3 {

	public static void main(String[] args) {
		
		int arr [] = {1,2,3,4,5,6,900,10,100};
		
		boolean found = false;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 100) {
				System.out.println("100 found on index " + i);
				found = true;
				break;
			}
		}
		
		if (!found) {
			System.out.println("There is no 100");
		}
		

	}

}
