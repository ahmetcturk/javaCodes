package week11;

import java.util.ArrayList;

public class BoxingUnboxing {

	public static void main(String[] args) {
	// From primitive data type to object is : Autoboxing
	// From object to primitive data type : Unboxing
	int a = 50; 
	
	// Boxing
	Integer integer = a;
	System.out.println(integer);
	
	Integer integer2 = 100;
	// Unboxing
	int b = integer2;
	System.out.println(b);
	
	ArrayList<Integer> arrayList = new ArrayList<>();
	arrayList.add(4); // Boxing
	int x = 100;
	arrayList.add(x); // Boxing
	
	int y = arrayList.get(0); // Unboxing
	System.out.println(y);
	
	}

}
