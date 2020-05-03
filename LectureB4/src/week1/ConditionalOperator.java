package week1;

public class ConditionalOperator {

	public static void main(String[] args) {
		
		// ? : Conditional Operator (Ternary Operator)
		
		int num1, num2;
		num1 = 10;
		
		num2 = (true) ? 100 : 9;
		//System.out.println(num2); // 100
		
		num2 = (false) ? 90 : 99;
		//System.out.println(num2); // 99
		
		num2 = (num1 == 10 && num1 > 7) ? 88 : 99;
	//	System.out.println(num2); // 

		if (4>9) num1 = 90; else num1= 99;
		
		int i=0;
		while(i<20){
			if(i==10){
				break;
			}
			System.out.println("i=" + i);
			i++;
	}}

}
