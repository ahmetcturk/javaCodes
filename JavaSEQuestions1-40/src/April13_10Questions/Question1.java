package April13_10Questions;

class Product {
	double price;
}

public class Question1 {
	public void updatePrice(Product product/* 200 */, double price/* 100 */) {
		price = price * 2; 						// 100*2 = 200
		product.price = product.price + price; // 200+200 = 400
	}

	public static void main(String[] args) {
		Product product = new Product();
		product.price = 200;
		double newPrice = 100; // this is the final price for Question1 Class!!!

		Question1 tQuestion1 = new Question1();
		tQuestion1.updatePrice(product, newPrice);
		System.out.println(product.price + " : " + newPrice);

	}

}
