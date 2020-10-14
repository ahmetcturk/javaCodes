package week3Tuesday;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import week2Thursday.StringMethods;

public class Example2 {

	public static void main(String[] args) {
	
		
		Scanner scan = new Scanner(System.in);
	    String str = scan.nextLine();
	    
	    String arr [] = str.split(",");
	    
	    String shortest = arr[0];
	    String secondShortest = arr[0];
	    for (int i = 0; i < arr.length; i++) {
			if(arr[i].length()< shortest.length()){
				shortest = arr[i];
			}
			if(arr[i].length()<= secondShortest.length()){
				secondShortest = arr[i];
			}
			
		}
	    
	    if (shortest.length() == secondShortest.length()) {
			System.out.println(shortest + " "+ secondShortest);
		}
	    else {
			System.out.println(shortest);
		}
		
	}

}
