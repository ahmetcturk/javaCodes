package week4;

import java.util.Scanner;


public class ReviewQuestions {
	
	
public static void findMiddle(String str){
	int position;
    int length;
    if (str.length() % 2 == 0)
    {
        position = str.length() / 2 - 1;
        length = 2;
    }
    else
    {
        position = str.length() / 2;
        length = 1;
    }
    System.out.println(str.substring(position, position + length));

}


	public static void main(String[] args) { // I will change something. Just ignore me :P
		// TODO Auto-generated method stub
		// findMiddle("Mehmet");
	    // average();
	     //findSmallest();
		//findVowel("ahmet");
		//enterNumber();
		 //quit();
		
		boolean check = true;
		for(;;){
			Scanner scanner = new Scanner(System.in);
			System.out.println("What is your name " );
			String name = scanner.nextLine();
			System.out.println(name);
			if (name.equalsIgnoreCase("Ahmet")) {
				break;
			}
		}
	    }
	public static void quit() {
		Scanner keyboard = new Scanner(System.in); String input;
		 char sure = 0;
		 
		 while (sure != 'Y' && sure != 'N') 								
			{
			 System.out.print("Are you sure you want to quit? "); input = keyboard.next();
			 sure = input.charAt(0);
									
			}
	}
	
	public static void enterNumber() {
		Scanner keyboard = new Scanner(System.in); 
		int x = 1;
		do{
				
			System.out.print("Enter a number: ");
				
			x = keyboard.nextInt(); } 
		 while (x > 0);
		 
	}
	
	
	
	public static void findVowel(String str) {
		int count = 0;
		
	        for (int i = 0; i < str.length(); i++)
	        {
	            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
	                    || str.charAt(i) == 'o' || str.charAt(i) == 'u')
	            {
	                count++;
	            }
	        }
	        System.out.println(count);
	}

	    

	 

	 public static void findSmallest() {
		 Scanner in = new Scanner(System.in);
	        System.out.print("Input the first number: ");
	        double x = in.nextDouble();
	        System.out.print("Input the Second number: ");
	        double y = in.nextDouble();
	        System.out.print("Input the third number: ");
	        double z = in.nextDouble();
	        double smallestV = Math.min(Math.min(x, y),z);
	        System.out.println(smallestV);
	} 


	public static void average()
    {
		Scanner in = new Scanner(System.in);
		System.out.print("Input the first number: ");
         double x = in.nextDouble();
        System.out.print("Input the second number: ");
         double y = in.nextDouble();
        System.out.print("Input the third number: ");
         double z = in.nextDouble();
        System.out.print("The average value is " +"\n" );
        System.out.println((x + y + z) / 3);
    }
    

}
