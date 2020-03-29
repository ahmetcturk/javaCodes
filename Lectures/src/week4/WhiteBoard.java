package week4;

import java.util.Scanner;

public class WhiteBoard {
public static void name(Scanner scanner) {
	System.out.println("What is your name : ?");
	String name = scanner.nextLine();
	System.out.println(name);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
			name(scanner);
			lastName(scanner);
	}
	
	public static void lastName(Scanner scanner) {
		System.out.println("What is your lastname : ?");
		String name = scanner.nextLine();
		System.out.println(name);
		
	}

}
