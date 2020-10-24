package week5Lab;

public class Question7 {

	public static void main(String[] args) {
			cProfits(100, 20);
	}
	
	
	static void cProfits(int buyPrice, int sellPrice){
		if (buyPrice > sellPrice) {
			System.out.println("loss");
		} else if(buyPrice < sellPrice) {
			System.out.println("profit");
		}
		
		else {
			System.out.println("no profit, no loss");
		}
	}

}
