package week_11Tuesday;

import java.time.LocalDate;

public class DateConcept1 {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		// Tomorrow's date
		System.out.println("Tomorrow's date : " + today.plusDays(1));
		// Yesterday's date
		System.out.println("Yesterday's date : " + today.minusDays(1));
		
		System.out.println(today.lengthOfYear());
		
		LocalDate date = LocalDate.of(2019, 02, 1);
		System.out.println("Length of 2019 : " + date.lengthOfYear());
		System.out.println("Lenght of the February in 2019 : "+ date.lengthOfMonth());

		
	}

}
