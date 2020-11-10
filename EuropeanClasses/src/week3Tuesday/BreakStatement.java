package week3Tuesday;

public class BreakStatement {

	public static void main(String[] args) {
		// Break statement : terminates the loop
		// For loop will keep working until encounters with break statement
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 8) {
				//break;
			}
		}
		
		// Create a program which checks array, if array has 100, prints out i found 100, and stops
		int arr[] = {12, 45,66,90,11,100,55, 99, 100};
		
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == 100){
				System.out.println("I found the 100 at " + i +" index number");
				//break;
			}
		}
		
	}

}
