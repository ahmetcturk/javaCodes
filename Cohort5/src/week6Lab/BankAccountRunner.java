package week6Lab;

public class BankAccountRunner {

	public static void main(String[] args) {
		
		BankAccount customer1 = new BankAccount();
		customer1.depositMoney(1000);
		customer1.withdrawMoney(50);
		System.out.println(customer1.balance);
		

	}

}
