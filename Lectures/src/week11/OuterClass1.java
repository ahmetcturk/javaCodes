package week11;

import week11.Outer.Inner;

public class OuterClass1 {

	private int SerialNo = 10;
	
	class Inner extends OuterClass1  {
		int number = 10;
		private int getValue(){
			return SerialNo;
		}
		void displayCaller(){
			displaySerialNo();
		}
	}    
	void displaySerialNo(){
		Inner object = new Inner();
		object.getValue();
	}
}
class OuterClass2{
	void displaySerialNo(){
		OuterClass1 outerObject = new OuterClass1();
		OuterClass1.Inner object = outerObject.new Inner();
		//object.getValue(); // --> Compiler Error
		//System.out.println(object.SerialNo);// --> Compiler Error
		//System.out.println(object.getValue());// --> Compiler Error
		// System.out.println(object.number);
		object.displaySerialNo();
		
	}
}
