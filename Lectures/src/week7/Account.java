package week7;

public class Account  {
	private String id;
	private String name;
	private int balance;
	
	public Account(String id, String name) {
		this.id = id;
		this.name = name;
	}
	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getBalance() {
		return balance;
	}
	public int credit(int amount){
	 return balance +=amount;
	}
	public int debit(int amount){
		if(amount <=balance){
			return balance-=amount;
		}else{
			System.out.println("Amount exceeded!");
		}
		return balance;
	}
	public int transferTo(Account another, int amount){ 
		  if( amount<=balance){
		  	return another.balance=balance-amount;
		   	
		}else{
			System.out.println("Amount exceeded!");
			return balance;
		}
	}
	public String toString(){
		return id + " " + name + " " + balance;
	}
	public static void main(String[] args){
		Account first = new Account("007", "James", 1000);
		Account second = new Account("005", "Adem", 2000);
		System.out.println(first.getBalance());
		System.out.println(second.getBalance());
		System.out.println(first.credit(500));
		System.out.println(first.debit(300));	
		//from first account to second $800 transfer
		System.out.println(first.transferTo(second, 800));
		System.out.println(first.toString());
	}
}