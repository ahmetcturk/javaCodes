package dateTime;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class DateConcept {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		System.out.println("Today's date : " + today);
		System.out.println("Tomorrow's date : " + today.plusDays(1));
		System.out.println("Yesterday's date : " + today.plusDays(1));
		System.out.println("Date after 1 week : " + today.plusWeeks(1));
		// Length of the year
		System.out.printf("%s days in %s\n",today.lengthOfYear(),today.getYear());
		System.out.println(today.lengthOfYear());
		System.out.println("The length of 2019 : "+ today.minusYears(1).lengthOfYear());
		
		// Is leap year ? 
		System.out.printf("%s is leap year ? %s",today.get(ChronoField.YEAR),today.isLeapYear());
		
		
	}

}
