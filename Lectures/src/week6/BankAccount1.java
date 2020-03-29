package week6;

public class BankAccount1 {
	private String name;
	private double balance;
	private static int transaction;
	private static int customer;
	
// I would like to learn the number of the transactions in this bank account
	
	public BankAccount1(String name) {
		this.name = name;
		customer++;
	}
	static void method(double amount){
		//balance += amount; compiler error
		// We can not use non-static fields-variables inside of static methods
		
	}

	public static void main(String[] args) {
		BankAccount1 object1 = new BankAccount1("Ahmet"),object2 = new BankAccount1("John"),
				object3 = new BankAccount1("Ethan");
		object1.deposit(9000);object1.deposit(2000);object2.deposit(5000);
		object2.withDraw(5000);object3.deposit(7000);
		System.out.println(transaction);
		//System.out.println(customer);
	}
	
	void withDraw(double amount){
		balance -= amount;
		transaction++;
	}
	
	void deposit(double amount){
		balance += amount;
		transaction++;
	}

}
