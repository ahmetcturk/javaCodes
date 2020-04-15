package week10Lab;

import java.io.IOException;



class X {
	public void printFileContent() throws IOException{
		throw new IOException("exception");
	}
}

public class Question1 {

	public static void main(String[] args) throws IOException {
		X xobj = new X();
		xobj.printFileContent();
	}

}
