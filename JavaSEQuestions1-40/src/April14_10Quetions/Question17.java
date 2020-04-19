package April14_10Quetions;
// Which three lines when inserted independently at line n1, cause the program to print a 0 balance?  
class CheckingAccount {
	public int amount;

	public CheckingAccount(int amount) {
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void changeAmount(int x) {
		amount += x;
	}
}

public class Question17 {

	public static void main(String[] args) {
		
		CheckingAccount acct = new CheckingAccount((int) (Math.random()*1000));
		//line n1
				// this.amount =0;							//A
				// amount = 0;								//B
				// acct(0);									//C
				// acct.amount =0;							//D
				// acct.getAmount() = 0;					//E
				// acct.changeAmount(0);					//F
				// acct.changeAmount(-acct.amount);			//G
				// acct.changeAmount(-acct.getAmount());	//H
		
		System.out.println(acct.getAmount());
		
		
		

	}

}
