package week5;

import javax.swing.JOptionPane;

public class Dashboard1 {
	public static void start() {
		int command;
		 do{
			 String string = JOptionPane.showInputDialog("Enter Your number : \n" + "What do you want \n"+
						"1- show your name\n" + "2- show your full name \n" + "3- calculate your gross pay\n" + 
								"4- Exit");
				command = Integer.parseInt(string);
				switch (command) {
				case 1:
					Tuesday1.showYourName();
					
					break;
				case 2:
					Tuesday1.showYourFullName();
					break;
				case 3:
					Tuesday1.grossPay();
					break;
				case 4:
					System.exit(0);
					break;

				}
			}
		while (command != 4);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//showYourName();
		//System.exit(0); // it finishes the program
		//showYourFullName();
		//ParsetoInt();
		//grossPay();
		start();
		
		
		
		
		
	}
}
