package week5;

import java.util.Scanner;

import javax.swing.JOptionPane;



public class Tuesday {
public static void showDialog(){
	String name;
	name = JOptionPane.showInputDialog("Enter your name.");
	//System.exit(0);
}

public static void printNames(){

	String firstName; // The user's first name String middleName; 
	String middleName;// The user's middle name String lastName; 
	String lastName;// The user's last name 
	// Get the user's first name.
	firstName =JOptionPane.showInputDialog("What is " + "your first name? ");
	// Get the user's middle name. middleName =
	middleName = JOptionPane.showInputDialog("What is " + "your middle name? ");
	
	// Get the user's last name. lastName =
	lastName = JOptionPane.showInputDialog("What is " + "your last name? ");

	// Display a greeting 
	JOptionPane.showMessageDialog(null, "Hello " +firstName + " " + middleName + " " + lastName);
	
}
public static void parseNumbers() {

	int number;
	String str;
	str = JOptionPane.showInputDialog("Enter a number."); 
	number = Integer.parseInt(str);
	
	double price;
	String str1;
	str1 = JOptionPane.showInputDialog("Enter the retail price."); 
	price = Double.parseDouble(str1);
}

public static void rate(){
	String inputString; 
	String name1;
	int hours;
	double payRate; 
	double grossPay;
	// For reading input
	// The user's name
	// The number of hours worked // The user's hourly pay rate // The user's gross pay
	// Get the user's name.
	name1 = JOptionPane.showInputDialog("What is " +
	"your name? ");
	
	// Get the hours worked. 
	inputString =JOptionPane.showInputDialog("How many hours " +
	"did you work this week? ");
	
	// Convert the input to an int.
	hours = Integer.parseInt(inputString);
	
	// Get the hourly pay rate. 
	inputString =
	JOptionPane.showInputDialog("What is your " + "hourly pay rate? ");
	
	// Convert the input to a double.
	payRate = Double.parseDouble(inputString);
	
	// Calculate the gross pay. 
	grossPay = hours * payRate;
	
	// Display the results. 
	JOptionPane.showMessageDialog(null, "Hello " +
	name1 + ". Your gross pay is $" + grossPay);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//showDialog();
		//rate();
		printMenu();
		String str;
		//int choice;
		str = JOptionPane.showInputDialog("Enter your number.\n"+ "What do you want ?\n" + 
		"1 - Enter your name\n" + "2 - Print full name\n" 
			+ "3 - Calculate your Gross pay\n" + "4 - Exit");
		//choice = Integer.parseInt(str);
		
		int command = Integer.parseInt(str);
		while (command != 4) {
			
			
			switch (command) {
			case 1: {
				showDialog();
				command = 4;
				break;
			}
			case 2: {
				printNames();
				command = 4;
				break;
			}
			case 3: {
				rate();
				command = 4;
				break;
			}
			case 4 : {
				break;
			}
			
			}}}
		

						
	
	
	private static void printMenu() {
		
//	    System.out.println("What do you want ?");
//	    System.out.println("1 - Print your name");
//	    System.out.println("2 - Print full name");
//	    System.out.println("3 - Calculate your Gross pay");
//	    System.out.println("4 - Exit");
	}

}
