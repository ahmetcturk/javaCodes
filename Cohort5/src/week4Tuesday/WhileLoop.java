package week4Tuesday;

public class WhileLoop {

	public static void main(String[] args) {
		
		// While loop is another kind of loop
		
		int i = 0;
		while(i<5){
			
			System.out.println(i);
			i++;
		}
		
		while(i>0){
			//System.out.println(i);
			i--;
		}
		
		
		boolean check = true;
		int j = 0;
		
		while(check){
			if (j > 5) {
				System.out.println(j);
				check = false;
			}
			j++;
		}
		System.out.println(j);
		
		
		// Challenge : Create a program with while loop which finds reverse of a string
		
		String name = "Selenium";
		int number = name.length();
		
		while (number > 0) {
			System.out.print(name.charAt(number-1));
			number--;
		}
		
		System.out.println();
		
		// Challenge : Find the sum of the numbers from 1 to 100 with while loop
		
		int sum = 0;
		
		int count = 1;
		while (count <=100) {
			sum = sum + count;
			count++;
		}
		System.out.println(sum);
		
		
		
		int arr [] = {1,2,3,6,7,8,5,4,3};
		
		
		// Challenge : find the sum of the array with while loop
		
		int counter = 0; 
		int sumOfArray = 0;
		while (counter<arr.length) {
			sumOfArray += arr[counter]; // sumOfArray = sumOfArray + arr[counter];
			counter++;
		}
		
		System.out.println(sumOfArray);
		
		
		
		// Challenge, print only odd numbers in array with while loop
		
		int counter1 = 0;
		
		while(counter1<arr.length){
			if(arr[counter1] %2==1){
				System.out.println(arr[counter1]);
			}
			counter1++;
		}
		
		
		
		
		

	}

}
