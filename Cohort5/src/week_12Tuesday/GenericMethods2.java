package week_12Tuesday;

public class GenericMethods2 {
	
	// Challenge : Array Printer Method which can print all data type of the array
	
	static <E> void printArray(E[] element){
		for (E e : element) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		Integer arr[] = {1,2,3,4,5};
		String arr2[] = {"a", "b", "c"};
		
		//printArray(arr);
		printArray(arr2);
		

	}

}
