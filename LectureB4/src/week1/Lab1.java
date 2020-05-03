package week1;

public class Lab1 {

	public static void main(String[] args) {
		
		//1) Write a java program to convert Fahrenheit to Celsius  
		
		//(°F to °C, Deduct 32, then multiply by 5, then divide by 9)
		
		float fahreneit = 100;

		float celcius = (fahreneit - 32)*5/9;
		
		System.out.println(fahreneit+ " °F is equals to " + celcius +" °C");

		//2) Write a Java program that reads a number in inches, 
		//convert it to meters. Note : One inch is 0.0254 meter.
		
		double inches = 19;
		
		final double incToMeterConstant = 0.0254;
		
		double meter = inches *incToMeterConstant ;
		
		System.out.println(inches + "\" = " + meter + " m");
		
		//3) Write a Java program to convert minutes into a number of years and days

		int minutes = 10000000;
		// In one day, there are 1440 minutes
		// In one year there are 525600 minutes
		
		int minutesInDay = minutes / 1440;
		
		int minutesInYear = minutes / 525600;
		
		System.out.println(minutes + " minutes = " + minutesInDay + " days");
		System.out.println(minutes + " minutes = " + minutesInYear + " years");
		
		//4) Write a Java program to compute body mass index (BMI)-----BMI = kg/m2 
		
		int weight = 70;
		
		double height = 1.7;
		
		double BMI = weight / (Math.pow(height, 2)); // (Math.pow(height, 2)) = height * height

		System.out.println("If your weight is " + weight + " and your height is " + height+
				" then your BMI is " + BMI );
		// 10 minutes break (11-11:10 am)
		
		//5) Write a java program to find the sum of the 3 digits numbers, 
		//if number = 456, output = 15
		
		int number = 298;
		
		int thirdDigit = number%10; // 8
		
		number /= 10;// number = 29
		
		int secondDigit = number%10; // 9
		
		number /= 10;// number = 2
		
		int firstDigit = number%10; // 2
		System.out.println(thirdDigit + secondDigit + firstDigit);
		
		
		// 6) 
		
//		byte x;
//        int a = 270;
//        double b = 128.128;
//        x = (byte) a;
//        System.out.println("a and x " + a + " " + x);
//        a = (int) b;
//        System.out.println("b and a " + b + " " + a);
//        x = (byte)b;
//        System.out.println("b and x " + b + " " + x);

		// 7) 
		long l = 130;
        int i = 44;
        short s = 33;
        byte b    = 22;
        
        i = (int) l;
        s = (short) i;
        b = (byte) s;

        System.out.println("l = " + l);
        System.out.println("i = " + i);
        System.out.println("s = " + s);
        System.out.println("b = " + b);

	}

}
