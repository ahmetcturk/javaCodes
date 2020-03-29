package week5;

import javax.swing.JOptionPane;

public class Tuesday1 {
// Create GUI (Graphical User Interface) program 

	public static void showYourName(){
		
		String name; 
		name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hello "+ name); // we need to write null to show message

	}
	public static void showYourFullName() {
		String firstName;
		String middleName;
		String lastName;
		
		firstName = JOptionPane.showInputDialog("Enter your first name : ");
		middleName = JOptionPane.showInputDialog("Enter your first Middle Name : ");
		lastName = JOptionPane.showInputDialog("Enter your first Last name : ");
		JOptionPane.showMessageDialog(null, "Hello "+ firstName + " " + middleName + " " + lastName);
		System.out.println("Hello "+ firstName + " " + middleName + " " + lastName);
		
		
	}
	public static void ParsetoInt(){
		int number;
		String string;
		string = JOptionPane.showInputDialog("Enter your Number");
		number = Integer.parseInt(string);
		System.out.println(number + 9);
		
	}
	public static void grossPay(){
		String name;
		int hours;
		String stringHours, stringPayRate, stringGrossPay;
		double payRate; // how much do you get hourly
		double grossPay;
		
		name = JOptionPane.showInputDialog("What is your name  ?");
		
		stringHours = JOptionPane.showInputDialog("How many hours did you work ? ");
		hours = Integer.parseInt(stringHours);
		
		stringPayRate = JOptionPane.showInputDialog("What is your pay rate  ");
		payRate = Double.parseDouble(stringPayRate);
		
		grossPay = hours * payRate; // this is the formula to calculate gross pay
		JOptionPane.showMessageDialog(null, "Hello " + name + ", your grosspay is $" + grossPay);
	}
	

}
