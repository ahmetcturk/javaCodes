package preBootCamp;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class AssingmentOperators {

	public static void main(String[] args) {
		
		//Assignment operators :  = , +=, -=, *=, /=, %=
		
		// = turning left side into right side
		int x = 100; 
		int y = 90;
		x = y; // 
		System.out.println(x); // 90
		System.out.println(y); // 90
		x = 80;
		System.out.println(x); // 80
		
		// += turning left side into left + right side
		
		int a = 10;
		int b = 90;
		
		a += b; // a = a + b : 100
		System.out.println(a);
		System.out.println(b); // 90
		
		// -= turning left side into left - right side
		
		int number1 = 40;
		int number2 = 90;
		
		number1 -= number2; // number1 = number1 - number2
		System.out.println(number1);
		
		
		// *= turning left side into left * right side
		
		int number3 = 80, number4 = 3;
		number3 *= number4;
		System.out.println(number3);// 240
		
		// %= turning left side into left and right remainder
		
		int number5 = 100, number6 = 3;
		number5 %= number6; // number5 = number5 % number6
		System.out.println(number5);
		
		// /= turning left side into left / right side
		
		int a1= 90, b1 = 3;
		a1 /= b1; // a1 = a1 / b1;
		System.out.println(a1);
		
		
		// += You can use this operator to concatenate strings
		
		String name = "Ahmet";
		String lastName = " Can";
		
		name += lastName;
		
		System.out.println(name);
		
		
		
	}

}
