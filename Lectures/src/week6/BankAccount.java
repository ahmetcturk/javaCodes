package week6;

public class BankAccount {
private double balance;
private double interestRate;
private double interest;


public BankAccount(double balance, double interestRate) {
	this.balance = balance;
	this.interestRate = interestRate;
}

public double getInterest() {
	return interest;
}

public double getBalance() {
	return balance;
}
public double getInterestRate() {
	return interestRate;
}

public void deposit(double amount){
	balance += amount;
}
public void withdraw(double amount){
	balance -= amount;
}

public void addInterest(){
	balance += (0.01*interestRate); // math formula
}




}
