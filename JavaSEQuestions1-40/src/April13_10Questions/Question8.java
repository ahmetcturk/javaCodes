package April13_10Questions;

import java.io.IOException;

class X{
	public void printFileContent()/*1*/throws IOException{
		/*Any code*/
		throw new IOException();
	}
}

public class Question8 {

	public static void main(String[] args)/*2*/throws Exception {
		X xobj = new X();
/*3*/	try{
			xobj.printFileContent();
		}catch (IOException e) {}
		 catch(Exception e){}

	}

}
