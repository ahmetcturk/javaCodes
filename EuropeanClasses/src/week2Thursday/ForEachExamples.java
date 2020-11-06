package week2Thursday;

public class ForEachExamples {

	public static void main(String[] args) {
		
		// Create an array of numbers, and print doubles of the numbers -- 3 minutes
		
		int [] numbers = {4,5,6,7,8,9,100,200,300};
		
		int a = 0;
		for (int i : numbers) {
			a++; // a = a+1
			System.out.println("Element number " +a + " :"+ i*2);
		}
		
		System.out.println(a);

	}

}
