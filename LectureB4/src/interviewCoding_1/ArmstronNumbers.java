package interviewCoding_1;

public class ArmstronNumbers {

	public static void main(String[] args) {
		
		// Check if the integer is an Armstrong numbers
		
		// 153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
		// 370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
		
		int num = 370;
		int digit;
		int total = 0;
		int number = num;
		for (; number> 0; number = number/ 10) {
			digit = number %10;
			total = total + digit*digit*digit;
		}
		
		if (total == num) {
			System.out.println("This is armstrong number");
		}
		
		
		
		
	}

}
