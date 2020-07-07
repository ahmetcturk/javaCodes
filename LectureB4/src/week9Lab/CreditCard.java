package week9Lab;

interface IBankAccount {
 void withDrawDollar(double amount);
}

interface Lira {
	void withDrawLira(double amount);
	double TL = 0.2;

}

interface Rupee {
	void withDrawRupee(double amount);
	double RUPEE = 0.1;
}

interface Euro {
	void withDrawEuro(double amount);
	double EURO = 1.5;
}

class BankAccount implements IBankAccount,Lira,Rupee,Euro {
	private double myDollar;
	private double myLira;
	private double myRupee;
	private double myEuro;

	public BankAccount(double myDollar) {
		this.myDollar = myDollar;
		this.myLira = myDollar / TL;
		this.myRupee = myDollar / RUPEE;
		this.myEuro = myDollar / EURO;
	}

	public void withDrawDollar(double withdraw) {
		myDollar -= withdraw;
	}

	public void withDrawLira(double withdraw) {
		myDollar -= withdraw * TL;
		myLira = myDollar / TL;
		System.out.println("my lira is" + myLira);
		System.out.println("my dollar is " + myDollar);
	}

	@Override
	public void withDrawEuro(double amount) {
		myDollar -= amount * EURO;
		myEuro = myDollar / EURO;
		System.out.println("my euro is" + myEuro);
		System.out.println("my dollar is " + myDollar);
		
	}

	@Override
	public void withDrawRupee(double amount) {
		myDollar -= amount * RUPEE;
		myRupee = myDollar / RUPEE;
		System.out.println("my rupee is" + myRupee);
		System.out.println("my dollar is " + myDollar);
		
	}

}

public class CreditCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount ahmet = new BankAccount(100);
		ahmet.withDrawLira(10); 
		
	}

}
