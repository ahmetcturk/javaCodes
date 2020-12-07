package week_11Thursday;


import java.util.Arrays;
import java.util.Scanner;


public class Main {
	// Vargs : Variable arguments
	static void method(int ...a){
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		method(9);
		method(9,5,6,7,8);
		method();
	
		
	}

}