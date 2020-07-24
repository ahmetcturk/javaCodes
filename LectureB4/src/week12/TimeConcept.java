package week12;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeConcept {

	public static void main(String[] args) {
		
		LocalTime time1 = LocalTime.now();
		
		System.out.println(time1);
		
		time1 = LocalTime.of(07, 40);
		System.out.println(time1);
		
		// TimeFormatter
		LocalTime time2 = LocalTime.now();
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
		System.out.println(time2.format(dateTimeFormatter));
		
		
		boolean check = time1.isAfter(time2);
		System.out.println(check);
		

	}

}
