package week4Lab;

public class Question2 {

	public static void main(String[] args) {
		
		double prices [] = {10,20,30,40,20,10,99,12,9,8};
		
		int count = 0;
		// 0,1,2,3,4,5,6,7,8,9
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] > 20) {
				count ++; // count = count + 1;
			}
		}
		
		System.out.println(count);
		
		if (count > 0) {
			System.out.println(count + " prices are greater than 20");
		} else {
			System.out.println("There is no price greater than 20");
		}
	}

}
