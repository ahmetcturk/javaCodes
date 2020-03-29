package week4;

public class Lab4 {

	


public static void arrayPrinter(int []arrayParameter) {
		for (int i = 0; i < arrayParameter.length; i++) {
			System.out.println(arrayParameter[i]);
		}
		
	
	}
public static void areaOfRect(int width, int length){
	System.out.println(width * length);
}

public static void calculate(int n) {
	int result = 0;
	
	while(n > 0) {
		result += n % 10;
		n /= 10;
	}
System.out.println(result);
}

public static int calculate1(int n) {
	int result = 0;
	
	while(n > 0) {
		result += n % 10; // result = result + n%10
		n /= 10; // n = n/10
	}
	return result;
}

public static void reverseString(String string) {

		for (int i = string.length()-1; i >-1; i--) {
			System.out.print(string.charAt(i));
		}
		System.out.println();
}

public static void findDuplicate(int []arr) {

System.out.println("Finding duplicate elements in array using brute force method"); 
			for (int i = 0; i < arr.length; i++) { 
				for (int j = i + 1; j < arr.length; j++) { 
					if (arr[i] == arr[j] ) {
						// got the duplicate element 
						System.out.println(arr[j]);
				}
			}
		}

}
//Write a method named isEven that accepts an int argument. 
//The method should return true if the argument is even, or false otherwise. 
	public static boolean isEven(int num){
		if (num % 2 == 0) {
			return true;
		}else{
			return false;
		}
	}
	
	
	
	public static void main(String[] args) {

		if (isEven(95)) {
			System.out.println("Number is even");
		}else{
			System.out.println("Number is odd");
		}
//		int [] arrayArgument = {999999,999999,8,7,6,5,4,3};
//		int [] arrayArgument1 = {1111,1111,88,7,6,5,4,3,3};
//		findDuplicate(arrayArgument);
//		findDuplicate(arrayArgument1);
//		arrayPrinter(arrayArgument);
//		areaOfRect(5, 10);
//		calculate(999);
//		System.out.println(calculate1(888));
//		reverseString("Silicone labs");
//		reverseString("Java");
//		reverseString("kayak"); // palindrome

	
	
		}
}
