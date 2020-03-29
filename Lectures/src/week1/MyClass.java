package week1;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DataType variableName = value;
		
		byte myByte = 100;
		System.out.println("My Byte : " + myByte);
		System.out.println(myByte);
		
		short myShort = 8000;
		System.out.println("My Short : " + myShort);
		
		int number1 = 10;
		System.out.println("My number 1 : " + number1);
		
		int number2 = 50;
		System.out.println("My number 2 : " + number2);
		
		int sum,product; // sum = number1 + number2, product = number1*number2
		sum = number1 + number2;
		product = number1*number2;
		System.out.println("My sum : " + sum);
		System.out.println("My product : " + product);
		
		long longVariable = 10000000000000L; // we are using L after declaring the long variable
		System.out.println("My Long : " + longVariable);
			
		float myFloat = 5.9f; // we are using f after declaring the float variable
		System.out.println("My float : " + myFloat);
		
		double weightOfAtom = 3.5;
		System.out.println("My double : " + weightOfAtom);
		
		boolean myBoolean = true;
		
		char myChar = 'i';
		System.out.println(myChar);
		System.out.println((int)myChar); // casting - converting char to int 
		
		int numb1 = 90;
		int numb2 = 70;
		System.out.println("Number 1 : " + numb1);
		numb1 = numb2; // numb1 = 70; numb2 = 70
		
		//numb2 = numb1;
		System.out.println("Number 1 : " + numb1);
		
		// numb1 = 70; numb2 = 70
		numb1 += numb2; // numb1 = numb1 + numb2; --> numb1 = 140
		System.out.println("Number 1 : " + numb1);
		
		// numb1 = 140, numb2 = 70;
		numb1 -= numb2; // numb1 = numb1 - numb2; --> numb1 = 70;
		System.out.println("Number 1 : " + numb1);
		
		// numb1 = 70, numb2 = 70
		numb1 *= numb2; // numb1 = numb1 * numb2; --> numb1 = 70*70 = 4900
		System.out.println("Number 1 : " + numb1);
		
		// numb1 = 4900
		numb1--; // numb1 = numb1 - 1; --> numb1 = 4899
		System.out.println("Number 1 : " + numb1);
		
		// numb1 = 4899
		numb1++; // numb1 = numb1 + 1; --> numb1 = 4900 --> 4899 = 4899 + 1
		System.out.println("Number 1 : " + numb1);
		
		// numb1 = 4900
		numb1 += 9;// numb1 = numb1 + 9; --> 4909
		System.out.println("Number 1 : " + numb1);
		
		boolean myBoolean1 = 6>9;
		System.out.println("My boolean 1 : " + myBoolean1);
		
		boolean myBoolean2 = 9>8;
		System.out.println("My boolean 2 : " + myBoolean2);
		
		myBoolean1 = 7>=9; // it is true if 7 is greater than 9, or equal to 9
		System.out.println("My boolean 1 : " + myBoolean1);
		
		myBoolean1 = 7!=9; // 7 is not equal to 9
		System.out.println("My boolean 1 : " + myBoolean1);
		
		myBoolean1 = 7==9; // 7 is equal to 9
		System.out.println("My boolean 1 : " + myBoolean1);
		
		
		// Boolean Logic : or - and
		
		//  || - or IF one of the left side or right side is true, then it is going to be true
		//  && - and  IF left side and right side is true, then it is going to be true
		
		
		
		
		
		
		
		
	}

}
