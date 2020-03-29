package week5;


public class BankAccountRuner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ahmet = new BankAccount();
		ahmet.accountNumber = "1234";
		ahmet.balance = 1000;
		ahmet.customerName = "Ahmet Can Turk";
		ahmet.phoneNumber ="862";
		ahmet.withdrawMoney(100);
		System.out.println(ahmet.balance);
		ahmet.depositMoney(900);
		System.out.println(ahmet.balance);
		
		
	}

}
