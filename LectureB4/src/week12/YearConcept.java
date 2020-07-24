package week12;

import java.time.Year;

public class YearConcept {

	public static void main(String[] args) {
		
		// Year
		Year year = Year.of(2010);
		System.out.println(year);
		System.out.println(year.isLeap());
		
		Year year2 = Year.now();
		
		boolean check = year2.isAfter(year);
		System.out.println(check);

	}

}
