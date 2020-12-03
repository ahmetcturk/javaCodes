package week_11Tuesday;

import java.time.Month;
import java.time.Year;
import java.time.YearMonth;

public class YearConcept {

	public static void main(String[] args) {
		
		Year year = Year.of(2012);
		
		System.out.println(year);
		// Checks if year is leap year
		System.out.println(year.isLeap());
		
		System.out.println(Year.now().isAfter(Year.of(2021)));
		
		
		YearMonth date = YearMonth.now();
		System.out.println(date.getMonthValue());
		System.out.printf("%s : %d%n", date, date.lengthOfMonth());
		
		YearMonth date2 = YearMonth.of(1990, Month.FEBRUARY);
		System.out.printf("%s : %d%n", date2, date2.lengthOfMonth());
		
		YearMonth date3 = YearMonth.of(2012, Month.FEBRUARY);
		System.out.printf("%s : %d%n", date3, date3.lengthOfMonth());
		
		
		
	}

}
