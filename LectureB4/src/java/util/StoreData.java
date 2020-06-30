package java.util;

public class StoreData {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		System.out.println("Hello");
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns"); 

	}

}
