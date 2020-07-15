package week10Recap;

import java.util.ArrayList;

public class Example {
	static int num;
	ArrayList<Integer> digits;
	
	public Example(int num) {
		digits = new ArrayList<>();
		if (num>0) {
			
		
		int digitNumber;
		while (num>0) {
			digitNumber = num%10 ;
			digits.add(0,digitNumber);
			num = num/10;
		}
		}
	}
	
	boolean isIncreasing(){
		for (int i = 0; i < digits.size(); i++) {
			for (int j = i+1; j < digits.size(); j++) {
				if (digits.get(i) > digits.get(j)) {
					return false;
				}
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		
		System.out.println(new Example(123).isIncreasing());
		
		
		
		
		
		
	}
	
}
