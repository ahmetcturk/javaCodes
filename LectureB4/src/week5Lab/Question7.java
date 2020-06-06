package week5Lab;

public class Question7 {

	public static void main(String[] args) {
		System.out.println(cProfit(100, 90));
		System.out.println(cProfit(90, 100));
		System.out.println(cProfit(100, 100));
	}

	static String cProfit(int buyPrice, int sellPrice) {

		if (buyPrice > sellPrice) {
			return "loss";
		} else if (buyPrice < sellPrice) {
			return "profit";
		}
		else {
			return "no loss";
		}

	}

}
