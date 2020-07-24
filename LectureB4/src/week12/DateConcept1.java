package week12;

import java.time.LocalDate;

public class DateConcept1 {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		System.out.println(today);	
		
		System.out.println("Tomorrow's date: " + today.plusDays(1));
		// Find out yesterday's date
		System.out.println("Yesterday's date: " + today.minusDays(1));
		
		// Date one week later
		System.out.println("One week later : " + today.plusWeeks(1));
		
		// Length of this year
		System.out.println(today.lengthOfYear());
		
		System.out.printf("%s days in %s\n" , today.lengthOfYear(),today.getYear());
		
		
	}
	

}
