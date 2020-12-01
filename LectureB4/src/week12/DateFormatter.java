package week12;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatter {

	public static void main(String[] args) {
		/*
		LocalDate:
		    year: yyyy
		    month: MM (number), MMM(three letters of month), MMMM(full name)
		    days: dd
		    name of day: E(three letters) , EEEE (full name)
		LocalTime:
		    hours: hh
		    minutes: mm
		    seconds: ss
		    am/pm: a
		 */
		
		// Date formatter example 
		LocalDate date = LocalDate.of(2020, 12, 8);
		System.out.println(date);
		
		// 1 way
		String dateStr = date.format(DateTimeFormatter.ofPattern("MMM dd yyyy Q G"));
		
		System.out.println(dateStr);
		
		// 2 way
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		
		String formattedDate = date.format(dateTimeFormatter);
		
		System.out.println(formattedDate);
		
		
		

	}

}
