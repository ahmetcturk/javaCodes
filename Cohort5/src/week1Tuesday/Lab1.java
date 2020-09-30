package week1Tuesday;

public class Lab1 {

	public static void main(String[] args) {
		
		//1) Write a java program to convert Fahrenheit to Celsius  
		//(°F to °C, Deduct 32, then multiply by 5, then divide by 9)
		
		double F = 80;
		double C = ((F-32)*5)/9;
		
		System.out.println(F + " F is equals to " + (int)C + " C");
		
		//2) Write a Java program that reads a number in inches, 
		//convert it to meters. Note : One inch is 0.0254 meter.
		
		double inches = 1000;
		double inchMeterRatio = 0.0254;
		double meter = inches * inchMeterRatio;
		System.out.println(inches + " inches equals to " + meter + " meters");
		
				
		//3) Write a Java program to convert minutes into a number of years and days
		int minutes = 100000000;
		// In one day, there are 1440 minutes
		// In one year there are 525600
		int minutesInADay = minutes / 1440;
		
		int minutesInAYear = minutes / 525600;
		
		System.out.println(minutes + " minutes is equals to " + minutesInADay+  " days" );
		System.out.println(minutes + " minutes is equals to " + minutesInAYear+  " years" );
		
				
		//4) Write a Java program to compute body mass index (BMI)-----BMI = kg/m^2 	
		
		double height = 1.70;
		double weight = 65;
		
		//double BMI = weight/(height*height); 
		double BMI = weight / Math.pow(height, 2);
		System.out.println((int)BMI);
		

		//5) Write a java program to find the sum of the digits of the 3 digits numbers, 
		//if number = 456, output = 15
		// number input = 999 output = 27
		
		// Hint : number%10 = last digit
		
		int number = -100;
		int thirdDigit = number %10;
		
		number = number / 10; // number = 43
		
		int secondDigit = number %10;
		
		number = number / 10; // number = 4
		
		int firstDigit = number %10;
		 
		int sumOfDigits = firstDigit + secondDigit + thirdDigit;
		
		System.out.println(sumOfDigits);
		
		
		
		
		
		
		
		
	}

}
