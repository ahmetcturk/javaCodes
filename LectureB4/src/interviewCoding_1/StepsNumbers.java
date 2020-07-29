package interviewCoding_1;

public class StepsNumbers {

	public static void main(String[] args) {
		/*
		 * 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		 * 
		 */
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		
		/*
		 * 54321
		 * 5432
		 * 543
		 * 54
		 * 5
		 */
		for (int i = 5; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		
		/*
		 * 1
		 * 22
		 * 333
		 * 4444
		 * 55555
		 */
		
		for (int i = 1; i <= 5; i++) {
		for (int j = 1; j <= i; j++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	}

}
