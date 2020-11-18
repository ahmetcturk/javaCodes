package week3Saturday;

public class WhileLoop {

	public static void main(String[] args) {
		// While loop, do while loop,  for loop, for each loop
		// We are using for loop if we know how many times we want to run the program
		// And we usually prefer for loop for arrays and other lists
		// We use while loop if we don't know how many times we will execute the program.
		
		int i = 0; 
		while(i < 10){
			//System.out.println(i);
			i++;
		}
		
		// Print siliconelabs 10 times with while loop
		int count = 0; //0,2,4,6,8
		while(count<10){
			//System.out.println("Silicone labs");
			count +=2;
		}
		
		
		// Print numbers from 10-0
		
		int count1 = 10;
		while(count1>4){
			//System.out.println(count1);
			count1-=3;
		}
		
		//            0	1 2 3 4
		int arr [] = {3,4,5,2,1};
		
		int index = 0;
		while(index < arr.length){
			System.out.println(arr[index]);
			index++;
		}
		
		
		
		
		
		

	}

}
