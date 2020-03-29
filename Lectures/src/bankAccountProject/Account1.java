package bankAccountProject;

import java.util.Scanner;

public class Account1 {
	
	private String name;
	// 16 digit number
	private String accountNumber;
	public Account1(String name) {
		this.name = name;
		accountNumber = giveAccountNumber();
	}
	
	String giveAccountNumber(){
		int x = (int)(Math.random()*10000000);
		return Integer.toString(x);
	}

	public static void main(String[] args) {
		
		do{
			
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		Account1 object = new Account1(name);
		System.out.println(object.accountNumber);
		
	}while(true);
		
		
		}
}
