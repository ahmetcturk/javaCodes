package week6Thursday;


public class BookStore {
	// Finish the example in class work, And complete other buy and return methods
	// Create return methods, customers can return the amount they bought, they can not return more than they bought
	// Assign a price to all books and calculate the total amount that customer needs to pay after shopping
	 static int customerNumber;
	 static int crimeInventory = 100, comicsInventory = 90, biographyInventory = 40;
	
	void buyCrimeBooks(int amount){
		System.out.println("You bought crime book");
		crimeInventory -= amount;
	}
	void returnCrimeBook(int amount){
		System.out.println("You returned crime book");
		crimeInventory += amount;
	}
	public BookStore() {
		customerNumber++;
	}
	public static void main(String[] args) {
		BookStore customer = new BookStore(), customer2 = new BookStore();
		customer.buyCrimeBooks(10);
		customer2.buyCrimeBooks(20);
		customer.returnCrimeBook(10);
		
		System.out.println("Customer number : "+BookStore.customerNumber);
		
		System.out.println(BookStore.crimeInventory);
		
		
		
		
		
		

	}

}
