package week71;

public class Account {
	private String id;
	private String name;
	private int balance = 0;
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
	public int deposit(int amount) {
		return balance += amount;
	}
	public int withDraw(int amount) {
		if (amount <= balance) {
			balance -= amount;
			return balance;
			}
		else { 
			System.out.println("Amount Exceeded!");
			}
		return balance;
		}
		public int transferTo(Account another, int amount) {
			if (amount<= balance) {
				another.balance = another.balance + amount;
				this.balance -= amount;
				return balance;
			}else {System.out.println("Amount Exceeded!");}
			return balance;
		}
		public String toString() {
			return "Account[ ID ; " + id + ", Name: " + name + ", Balance: " + balance + " ]";
		}
	}
