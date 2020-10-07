package week3Tuesday;

public class ForEachLoop {

	public static void main(String[] args) {
		
		int [] values = {1,2,3,4,5,6,7,8,9,10};
		
		for (int i : values) {
			if(i%2==0){
				
			System.out.print(i + " ");
			
			}
		}
		
		System.out.println();
		
		// Create a String array and print with forEach loop
		
		String [] grades = {"A","F","C", "D", "A+"};
		
		for (String string : grades) {
			System.out.println(string);
		}
		
		
		// Challenge, print only positive numbers
		int [] array = {-1,0,1,2,3,66,-99,10};
		
		for (int i : array) {
			if (i > 0) {
				System.out.println(i);
			}
		}
		
		
		
		
		
		

	}

}
