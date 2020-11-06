package week2Thursday;

public class ArrayConcept2 {

	public static void main(String[] args) {
		int [] birthYears = {1990,1988,2000,2007,1964};
		// Age = CurrentYear - BirthYear
		
		// For Each Loop
		for (int i : birthYears) {
			//System.out.println("Your age is : " + (2020-i));
		}
		
		// Create an array for the names of the childrens in same family
		String[] names = {"John", "Emily", "Grace", "Abigale"};
		
		for (String string : names) {
			System.out.println(string + " Kondilas");
		}
		
		// Create an array of salaries, and calculate net salary after 30% tax
		int [] salaries = {3000,4000,5000,9000,10000};
		for (int i : salaries) {
			System.out.println(i*0.7);
		}
		
		
		
		

	}

}
