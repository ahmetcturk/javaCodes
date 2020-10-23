package week5Thursday;

public class NonVoidMethod3 {

	public static void main(String[] args) {
		System.out.println(lastChar("Java"));
		System.out.println(firtLast("Java"));
		System.out.println(FirstChar("Java") + "" +lastChar("Java") );
	}
	
	static char FirstChar(String string){
		return string.charAt(0);
	}
	
	
	// Create a method which returns the last character of the string
	
	static char lastChar(String string){
		return string.charAt(string.length()-1);
	}
	
	
	// Create a method which finds the first and last character of the String, and
	// returns them together.
	
	static String firtLast(String string){
		return string.charAt(0) +""+ string.charAt(string.length()-1);
	}
	
	
	
}
