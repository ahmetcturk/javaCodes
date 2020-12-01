package week6Tuesday;

public class BankAccount {
	double balance; 
	String customerName;
	String bankAcctNumber;
	
	public BankAccount(String customerName, String bankAcctNumber) {
		this.customerName = customerName;
		this.bankAcctNumber = bankAcctNumber;
	}
	
	// Deposit money method
	void deposit(double amount){ // Put amount to the bank
		balance += amount; // balance = balance + amount
	}
	
	public static void main(String[] args) {
		BankAccount customer1 = new BankAccount("Ahmet", "DE4356-99");
		customer1.deposit(900);
		System.out.println(customer1.balance);
		
		BankAccount customer2 = new BankAccount("Ilhan", "DE8743-90");
		customer2.deposit(10000);
		System.out.println(customer2.balance);
	}
	
	
	
}
