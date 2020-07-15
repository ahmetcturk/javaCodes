package week10Lab;

import java.io.IOException;

class Test{
	
	void readCard(int cardNo) throws Exception{}
	
	void checkCard(int cardNo) throws RuntimeException{}
	
}
// Checked exception will be seen underlined
// Checked exception will not be seen underlined
public class Question2 {

	public static void main(String[] args) {
		
		Test xTest = new Test();
		xTest.checkCard(111);
	//	xTest.readCard(999);
		

	}

}
