package week4;

public class ShortestLongestWordInArray {

	public static void main(String[] args) {
		String[] names = { "Ahmet", "Omer", "Murat", "Ilhan"};

		int maxLengthString = names[0].length(); // 4
		int minLengthString = names[0].length();

		String logestword = names[0];
		String shortestWord = names[0];

		for (int i = 0; i < names.length; i++) {

			if (names[i].length() > maxLengthString) {
				maxLengthString = names[i].length();
				logestword = names[i];
			}

			if (names[i].length() < minLengthString) {
				minLengthString = names[i].length();
				shortestWord = names[i];
			}

		}

		System.out.println(logestword);
		System.out.println(shortestWord);
		
	}

}
