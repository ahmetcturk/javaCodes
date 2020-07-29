package interviewCoding_1;

import java.util.*;

public class FactorNumberss {

	public static ArrayList<Integer> findFactors(int a) {
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				arr.add(i);
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		System.out.println(findFactors(10));

	}
}