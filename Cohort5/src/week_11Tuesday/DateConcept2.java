package week_11Tuesday;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateConcept2 {

	public static void main(String[] args) {
		/*
		 * month : MMMM(full name), MMM(three letters of month), MM(number), M(single number)
		 * year : yyyy(full year), yy(last two digit of year)
		 * days : dd(number of months)
		 * name of the day : E
		 */
		LocalDate date = LocalDate.of(2011, 8, 11);
		
		// Default format
		System.out.println(date);
		
		// First Way
		String dateStr = date.format(DateTimeFormatter.ofPattern("MMMM dd yyyy Q G E")); 
		System.out.println(dateStr);
		
		// Second Way
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd yyyy Q G E");
		
		System.out.println(date.format(formatter));
		
		// Challenge, create today's date, and use formatter object to format it. 
		
		LocalDate today = LocalDate.now();
		System.out.println(today.format(formatter));
		
		
	}

}
