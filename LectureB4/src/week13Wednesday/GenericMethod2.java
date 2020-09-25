package week13Wednesday;

public class GenericMethod2 {

	static <E extends Comparable<E>> E maximum(E x, E y, E z){
		
		E max = x;	
		if (y.compareTo(max) > 0) 
			max = y;
		if (z.compareTo(max) >0) 
			max = z;
		return max;
	}
	
	public static void main(String[] args) {
			
		System.out.println(maximum(9, 5, 6));
		System.out.println(maximum(9.0, 5.0, 6.0));
		System.out.println(maximum('A', 'B', 'C'));
		System.out.println(maximum("String","Java", "zelenium")); // alphabetically last value
		

	}

}
