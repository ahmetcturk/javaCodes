package interviewCoding_1;

public class ReverseString {

	public static void main(String[] args) {
		
		String name = "Silicone Labs";
		
		String reString = "";
		
		for (int i = 0; i < name.length(); i++) {
			reString += name.charAt(name.length() - i - 1);
		}
		
		System.out.println(reString);
		
		// Reverse String with string builder
		
		StringBuilder stringBuilder = new StringBuilder("Selenium");
		System.out.println(stringBuilder.reverse());

	}

}
