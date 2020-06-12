package week6Recap;

// This example demonstrates static concept and bank account example

public class BankAccount {
	
	// properties
	String name;
	int balance;
	static int countTotalTransaction;
	
	

	
	public BankAccount(String name) {
		this.name = name;
		this.balance = 0;
	}
	
	public void withDraw(int amount){
		if (balance > 0) {
			balance -= amount;
			countTotalTransaction++;
		}
	}
	public void deposit(int amount){
		balance = balance + amount; // balance += amount
		countTotalTransaction++;
	}
	
	// in order to see the balance, you need to pay 2 dollars
	public void showBalance(){
		if (balance > 2) {
			balance -= 2;
			System.out.println("Your balance is : " + balance);
			countTotalTransaction++;
		}
	}
	
	public static void main(String[] args) {
		BankAccount customer1 = new BankAccount("Ahmet");
		customer1.deposit(500); // balance = 500
		customer1.withDraw(200); // balance = 300
		customer1.showBalance(); // balance = 298
		BankAccount customer2 = new BankAccount("Huseyin");
		customer2.deposit(500); // balance = 500
		customer2.withDraw(200); // balance = 300
		customer2.showBalance(); // balance = 298
		System.out.println(BankAccount.countTotalTransaction);
	}

}
