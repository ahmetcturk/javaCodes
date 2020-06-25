package week7Lab;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		create_account user = new create_account("Ahmet", "Saving", 4298, 1000);
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		boolean check = true;
		do {
			System.out.println("1 - Deposit Money");
			System.out.println("2 - Withdraw Money");
			System.out.println("3 - Display Details");
			System.out.println("4 - Update informations");
			System.out.println("5 - Exit");
			int userChoice = scanner.nextInt();
			switch (userChoice) {
			case 1:
				System.out.println("Enter amount of money for deposit : ");
				int deposit = scanner.nextInt();
				user.deposit(deposit);
				System.out.println("Successfully deposited");
				break;
			case 2:
				System.out.println("Enter amount of money for withdraw : ");
				int withdraw = scanner.nextInt();
				user.withdraw(withdraw);
				System.out.println("Successfully withdrawed");
				break;

			case 3:
				System.out.println("Your info");
				user.display_details();
				break;
				
			case 4 : 
				
				System.out.println("Enter your name : ");
				String newName = scanner.next();
				System.out.println("Enter your Account type : ");
				String newType = scanner.next();
				int newAccountNumber = user.random();
				user.insert(newName, newAccountNumber, newType);
				user.display_details();
				break;
			case 5 : 
				System.out.println("Exit");
				check = false;
				break;
			}
			
		} while (check);
		
	}

}
