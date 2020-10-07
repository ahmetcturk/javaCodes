package week3Tuesday;

public class TwoDimensionalArray_2 {

	public static void main(String[] args) {
		
		// Challenge : create Object type 2d array and print all elements
		
		Object [][] array = {{true, false}, {1,2}, {"String", 'c'}};
		
		for (Object[] objects : array) {
			for (Object object : objects) {
				System.out.println(object);
			}
		}
		
	}

}
