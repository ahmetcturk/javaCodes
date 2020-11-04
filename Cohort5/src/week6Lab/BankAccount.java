package week6Lab;

public class BankAccount {

	private String accountNumber;
	 double balance;
	private String customerName;
	private String phoneNumber;

	// +depositMoney(double amount) : void
	// +withdrawMoney(double amount) : void
	
	// increase the balance by parameter amount
	public void depositMoney(double amount) {
		balance = balance + amount;
	}

	// decrease the balance by parameter amount
	public void withdrawMoney(double amount) {
		balance = balance - amount;
	}

}
