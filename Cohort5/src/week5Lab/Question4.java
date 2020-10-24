package week5Lab;

public class Question4 {

	static String reverse2(String string) {
		String reverse = "";
		for (int i = string.length() - 1; i > -1; i--) {
			reverse += string.charAt(i);
		}
		return reverse;
	}

	public static void main(String[] args) {

		reverse("Silicone");
		System.out.println(reverse2("Java"));
		
	}

	static void reverse(String string) {

		for (int i = string.length() - 1; i > -1; i--) {
			System.out.print(string.charAt(i));
		}
		System.out.println();
	}
	
	

}
