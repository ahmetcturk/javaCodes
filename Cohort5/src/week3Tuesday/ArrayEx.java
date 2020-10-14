package week3Tuesday;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
		
		
		String name[] = {"Ahmet", "Durmus","Hazal"};
		
		// Object 
		
		Object [] arr = {name, "Ahmet", 9, 9.9, true};
		//          0 1 2
		int [] birthYears = {1995,1990,1992};
		
		System.out.println(birthYears[2]);
		
		System.out.println(Arrays.toString(birthYears));
		// 0,1,2,3
		for (int i = 0; i < birthYears.length; i++) {
			System.out.println(2020 - birthYears[i]);
		}
		
		
		
		

	}

}
