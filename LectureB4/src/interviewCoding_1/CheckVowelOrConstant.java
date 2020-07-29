package interviewCoding_1;

public class CheckVowelOrConstant {

	public static void main(String[] args) {

		// check characters if they are vowels or consonants
		char character = 'a';

		// if blocks

		if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
			System.out.println("This is a vowel");
		} else {
			System.out.println("This is a consonant");
		}

		// switch case

		switch (character) {
		case 'a':
			System.out.println("This is a vowel");
			break;
		case 'e':
			System.out.println("This is a vowel");
			break;
			
		case 'i':
			System.out.println("This is a vowel");
			break;
		case 'o':
			System.out.println("This is a vowel");
			break;
		case 'u':
			System.out.println("This is a vowel");
			break;

		default:
			System.out.println("This is a consonant");
		}

	}

}
