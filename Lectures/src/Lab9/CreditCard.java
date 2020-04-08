package Lab9;

interface IBankAccount{
	void withDrawDollar(double withdraw);
}
interface Lira{
	double TL = 0.2;
	void withDrawLira(double withdraw);
	
}
interface Rupee{
	double RUPEE = 0.1;
	void withDrawRupee(double withdraw);
}
interface Euro{
	double EURO = 1.5;
	void withDrawEuro(double withdraw);
}
class BankAccount implements IBankAccount,Lira , Rupee, Euro{
	private double myDollar ;
	private double myLira ; 
	private double myRupee ;
	private double myEuro ;
	
	public BankAccount(double myDollar) {
		this.myDollar = myDollar;
		this.myLira = myDollar / TL;
		this.myRupee = myDollar / RUPEE;
		this.myEuro = myDollar / EURO;
	}
	

	public double getMyDollar() {
		return myDollar;
	}


	public void setMyDollar(double myDollar) {
		this.myDollar = myDollar;
	}


	public void withDrawDollar(double withdraw){
		myDollar -= withdraw;
		System.out.println("my dollar is " + myDollar);
	}
	
		public void withDrawLira(double withdraw){
		myDollar -= withdraw * TL;
		myLira = myDollar / TL;
		System.out.println("my lira is" + myLira);
		System.out.println("my dollar is " + myDollar);
		System.out.println("**************************");
		
	}


		@Override
		public void withDrawEuro(double withdraw) {
		myDollar -= withdraw * EURO;
		myEuro = myDollar / EURO;
		System.out.println("my euro is" + myEuro);
		System.out.println("my dollar is " + myDollar);// TODO Auto-generated method stub
		System.out.println("**************************");
		
		}


		@Override
		public void withDrawRupee(double withdraw) {
			myDollar -= withdraw * RUPEE;
			myRupee = myDollar / RUPEE;
			System.out.println("my rupee is" + myRupee);
			System.out.println("my dollar is " + myDollar);
			System.out.println("**************************");
			
		}
	
}
public class CreditCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	BankAccount ahmet = new BankAccount(100);
	ahmet.withDrawEuro(10);
	ahmet.withDrawLira(10);
	ahmet.withDrawRupee(10);
	}

}

