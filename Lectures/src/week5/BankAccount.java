package week5;

public class BankAccount {
	public String accountNumber;
	public double balance;
	public String customerName;
	public String phoneNumber;
	
	public void withdrawMoney(double amount){
		balance = balance - amount; // balance -=amount
	}
	public void depositMoney(double amount){
		balance = balance  + amount;
	}
	
	
}
