package week4;

public class SmallGroup {
	//Create the method sum that calculates the sum of numbers the method receives as parameters.

	   //Place the method in the following program body:

	   public static void sum(int number1, int number2, int number3, int number4) {
	    // write program code here
	    // remember that the method needs a return in the end
		System.out.println(number1 + number2 + number3 + number4);   
	   }
	   public static void minimum(int number1, int number2) {
		    // write program code here
		    // do not print anything inside the method

		    // method needs a return in the end
		   System.out.println("Smallest number among " + number1 + " and " + number2 + " is " +Math.min(number1, number2));
		   System.out.println("Biggest number among " + number1 + " and " + number2 + " is " +Math.max(number1, number2));
		   
		  } 


	public static void main(String[] args) {
		
		sum(3, 3, 3, 3); // calling method
		minimum(3, 9);
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
		int[] nums = {100,234,311,5433,6454,1233,54523,45645,1234,9999,988};
		int sum = 0 ;
		int sumOfEvens = 0 ;
		int sumOfOdds= 0  ;
				
			for (int i = 0; i < nums.length; i++) // range : 0-11
			{
			 sum = sum + nums[i]; // sum += nums[i]
			 
			 if (nums[i]%2 ==0) { // parity = oddness or evenness
				
				sumOfEvens = sumOfEvens + nums[i]; 
				//System.out.println(nums[i]);
			} else {
				sumOfOdds = sumOfOdds + nums[i];
				//System.out.println(nums[i]);
			}
		}
			//System.out.println(sum);
			//System.out.println(sumOfEvens);
			//System.out.println(sumOfOdds);

			
			
			//There should be 15 '$’' characters in each row , 10 rows
			
			String character = "$$$$$$$$$$$$$$$";
			//int i = 0;
			//while (i<10) {
				//System.out.println(character);
			//	i++;
			//}
			
			
			
			
			int [] arr = {10,200,50,67,600,700,800,900,100,2000};
			int i = 0;
			while(i<arr.length) { 
				if (arr[i] == 100) {
					//System.out.println("value found at : " + i + " th");
				break;
				} else {
				//	System.out.println("value not found at : " + i + " th");
					
				}
				i++;
			}

			String stairs = "";
			//System.out.println("$");
			for (int j = 0; j <5; j++) {
				stairs += " ";
				//System.out.println("$"+stairs+"$");
			}
			
			for (int j = 0; j < 10; j++) {
				// this program producing number 0-1 
				int number = (int)(Math.random()*2);
				//System.out.println(number); // numbers < 0.5
				if (number == 0) {
					System.out.println("No");
				} else {
					System.out.println("Yes");
				}
			}}
	

	
	
	
	 

}
