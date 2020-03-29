package week6;

import java.util.ArrayList;
import java.util.Scanner;

public class FlightTicketMachine {
	
private static int availableSeat = 3;
static ArrayList<Customer> custArr = new ArrayList<>();


void buyTicket(){
	
	while (availableSeat>0) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name ? ");
		String customerName = scanner.nextLine();
		custArr.add(new Customer(customerName));
		availableSeat--;
		System.out.println("Available seats : " + availableSeat);
		
		
	}
	
	
}

public static void main(String[] args) {
	new FlightTicketMachine().buyTicket();
	for (int i = 0; i < custArr.size(); i++) {
		System.out.print(custArr.get(i).name + " ");
	}
	System.out.println(Customer.count);

	
	
}

}
