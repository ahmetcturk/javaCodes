package ReviewPackage;

public class StringExample {

	public static void main(String[] args) {
		
		// String is a class, which has multiple pre-written methods
		// length(), toUpperCase(), toLowerCase(), 

		String aString = "Java Classes Spring 2020";
		System.out.println(aString.replace('a', ' '));
		
		// split() : creating a String[] out of the string characters
		
		String arr [] = aString.split("p");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		

		
		
	}

}
