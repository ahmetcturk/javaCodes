package week5;
// Create a method which returns true  if my integer 
// is even number otherwise, return false

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Recab2 {

	public static void main(String[] args) {
		LinkedList<Integer>  aIntegers = new LinkedList<>();
		aIntegers.add(5);
		aIntegers.add(1);
		aIntegers.add(10);
		System.out.println(aIntegers);
	}
	
	
	
	
	static boolean isEven(int a){
		
		if (a %2 ==0 ) {
			return true;
		} else {
			return false;
		}
		
	}

}
