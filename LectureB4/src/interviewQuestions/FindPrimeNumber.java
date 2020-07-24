package interviewQuestions;

public class FindPrimeNumber {

	public static void main(String[] args) {
		
		int n=7;
		int howManyTimes = 0;
		if (n > 2) {
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) 
					howManyTimes++; 
			}
		}
		if(howManyTimes==2|| n==2){
			System.out.println(n+ "is prime");
		}
		else{
			System.out.println(n+ " is not prime");
		}

	}

}
