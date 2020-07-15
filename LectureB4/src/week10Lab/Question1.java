package week10Lab;

import java.io.IOException;

class X{
	public void printFileContent() throws IOException  { // C
		
		throw new IOException();
		
	}
}


public class Question1 {

	public static void main(String[] args) throws Exception {
		
		X Xobj = new X();
	
			try {
				Xobj.printFileContent();
			} 
			catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Exception handled");
			}
		

	}

}
