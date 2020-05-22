package week4;

import javax.xml.stream.events.StartDocument;

public class Stairs {

	public static void main(String[] args) {
		
		String stairs = "";
		int i = 0; 
		while (i < 6) {
			stairs = stairs + "*";
			System.out.println(stairs);
			i++;
		}
		System.out.println(stairs);
		

	}

}
