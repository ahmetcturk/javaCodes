package week4;

public class WhileLoopConcept {

	public static void main(String[] args) {
		
		//  It is very easy to create infinite loops with while loops, be careful !
		
		// while(boolean condition){}
		
		// Print out Silicone labs 10 times
		
		int i = 1;
		while(i<=10){
			//System.out.println( i+ " : Silicone Labs");
			i++;
		}

		// Print numbers from 10-1 with while loop
		int  j = 5;
	//	System.out.println("j before while loop : " + j);
		while(j>0){
			//System.out.println(j);
			j--;
		}
		
		//System.out.println("j after while loop : " + j);
		
		while(j<5){
			//System.out.println(j);
			j++;
		}
		
		//System.out.println("j after 2nd while loop : " + j);
		
		int [] arr = {-3,-2,-1,0,1,2,3,4,5};
		
		int number = 0;
		while(number < arr.length){
			//System.out.println(arr[number]);
			number ++ ;
		}
		 
		
		
		
		
		
		
		
	}

}
