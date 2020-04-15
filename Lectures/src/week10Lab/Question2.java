package week10Lab;

import java.io.IOException;

public class Question2 {

	void readCard(int cardNo) throws Exception{
		System.out.println("Reading Card");
	}
	void checkCard(int cardNo) throws RuntimeException{ 
		System.out.println("Checking Card");
	}
	public static void main(String[] args) {
		Question2 ex = new Question2();
		int cardNo = 1234;
		ex.checkCard(cardNo);
	//	ex.readCard(cardNo);
		
	}

}
