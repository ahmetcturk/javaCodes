package week5Lab;



public class Question6 {

	public static void main(String[] args) {
		
		if(isEven(11))
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("Number is odd");
        }   
	}
	
	static boolean isEven(int a ){ // Parity(oddness, or evenness) of the numbers
		
		if (a%2==0) {
			return true;
		} else {
			return false;
		}
	}

}
