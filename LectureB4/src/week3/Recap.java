package week3;

public class Recap {

	public static void main(String[] args) {
		
		// Datatype[] variablename = {el1,el2,el3...}

		String[] grades = {"A", "B", "F", "C"};
		//                  0    1    2    3
		
		// retrieve elements : variablename[index]
	
		System.out.println(grades[0]); // "A"
		
		String ahmetsGrade= grades[0]; // Storing array elements in String
		
		System.out.println(ahmetsGrade); // A
		
		int [] numbers = {4298,4299};
		numbers[0] = numbers[1]; // numbers[0] = 4299
		numbers[1] = numbers[0]; // numbers[1] = 4299
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		
		// For Each loop to print elements in grades array
		for (String i : grades) {
			System.out.print(i + " ");
		}
		
	}

}
