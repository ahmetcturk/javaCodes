package week9Wednesday;

import java.util.ArrayList;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// Vector is synchronized, comparatively slower than arraylist
		// By default arraylist is not syncronized, but can be synchronized explicitly
		// with Collections.synchronizedList
		
		
		
		
		long time1= System.nanoTime();
		Vector object = new Vector<>();
		
		object.add("Ahmet");
		object.add("Hasan");
		object.add("John");
		
		for (Object object2 : object) {
			System.out.println(object2);
		}
		long time2 = System.nanoTime();
		
		
		long time3 = System.nanoTime();
		ArrayList object1 = new ArrayList<>();
		object1.add("Ahmet");
		object1.add("Hasan");
		object1.add("John");
		
		for (Object object2 : object1) {
			System.out.println(object2);
		}
		long time4 = System.nanoTime();
		
		System.out.println("Vector speed : "+(time2 - time1));
		System.out.println("Arraylist speed : "+(time4 - time3));
		

	}

}
