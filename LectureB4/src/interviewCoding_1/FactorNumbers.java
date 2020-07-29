package interviewCoding_1;

public class FactorNumbers {

	public static void main(String[] args) {
		// Find the factors of the integer
		
		int num = 17; //{1,2,4}
		
		
		for (int i = 1; i <= num; i++) {
			if (num%i==0) {
				System.out.print(i + " ");
			}
		}
		
		

	}

}
