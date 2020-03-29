package week6;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Employee1 ahmet = new Employee1("Ahmet Can Turk", 30,1000,50);
	Employee1 james = new Employee1("James Bond", 50);
	james.salary = 1000;
	james.workHours = 30;
	ahmet.work();
	ahmet.absence();
	System.out.println(ahmet.salary);
	
	james.work();
	james.absence();
	james.absence();
	System.out.println(james.salary);
	Scanner scanner2 = new Scanner(System.in);
	 System.out.println("enter the input");
int input = scanner2.nextInt();
int revers = 0;
int remain = 0;

for(int num = input; num > 0; num /= 10){
	 remain = num % 10;
		 revers = revers * 10 + remain;
		 
}
System.out.println(revers);
	}

}
