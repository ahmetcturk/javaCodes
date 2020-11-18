package week3Saturday;

import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		System.out.println(new Example().isAnagram("rats", "words"));
		

	}

	public boolean isAnagram(String word1, String word2) {

		String[] arr = word1.split("");
		Arrays.sort(arr);
		String[] arr2 = word2.split("");
		Arrays.sort(arr2);
		return Arrays.equals(arr, arr2);
	}

}
