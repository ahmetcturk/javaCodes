package week3Lab;

public class Question2 {

	public static void main(String[] args) {
		 //Question 2
		double prices[] = {30,99,88,29,11};
		
		int count = 0;
		for(int j = 0; j < prices.length ; j++){
			if (prices[j] > 20) {
				count++;
			}
			
		}
		System.out.println(prices.length - count); // elements less than 20
		if (count > 0) {
			System.out.println(count +" number of item is greater than 20");
		} else {
			System.out.println("There is no item greater than 20");
		}

	}

}
