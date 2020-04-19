package April13_10Questions;
/*
 * 􏰯􏰖􏰘
 */

class Customer {
	ElectricAccount acct = new ElectricAccount();

	public void useElectricity(double kWh) {
		acct.addKWh(kWh);
	}

}

class ElectricAccount {
	private double kWh;
	private double rate = 0.07;
	private double bill;

	public void addKWh(double kWh) {
		if(kWh >0){
			this.kWh += kWh;
			this.bill = this.kWh * this.rate;
		}
	}

}

public class Question9 {

	public static void main(String[] args) {

	}

}
