package week5Lab;

public class Question4 {

	public static void main(String[] args) {

		String string = "Silicone Labs";
		String string1 = "Silicone Labs Students";
		
		reverseString(string);
		System.out.println();
		reverseString(string1);
		System.out.println();
		System.out.println(reverseTheString("Ahmet Can"));

	}
	
	static String reverseTheString(String string) {
		String reversed = "";
		for (int i = string.length() - 1; i > -1; i--) {
			reversed += string.charAt(i);
		}
		return reversed;
	}
	
	
	
	static void reverseString(String string) {
		for (int i = string.length() - 1; i > -1; i--) {
			System.out.print(string.charAt(i));
		}
	}

}
