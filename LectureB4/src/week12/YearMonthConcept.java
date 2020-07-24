package week12;

import java.time.Month;
import java.time.Year;
import java.time.YearMonth;

public class YearMonthConcept {

	public static void main(String[] args) {
		// YearMonth
		YearMonth date = YearMonth.now();
		System.out.printf("%s: %d%n", date, date.lengthOfMonth());

		YearMonth date2 = YearMonth.of(2010, Month.FEBRUARY);
		System.out.printf("%s: %d%n", date2, date2.lengthOfMonth());

		YearMonth date3 = YearMonth.of(2012, Month.FEBRUARY);
		System.out.printf("%s: %d%n", date3, date3.lengthOfMonth());
		
		

	}

}
