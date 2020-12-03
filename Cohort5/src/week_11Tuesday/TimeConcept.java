package week_11Tuesday;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeConcept {

	public static void main(String[] args) {
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalTime time2 = LocalTime.of(14, 59, 33);
		System.out.println(time2);
		
		System.out.println(time.format(DateTimeFormatter.ofPattern("hh:mm:ss a")));
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
		
		System.out.println(time2.format(formatter));
		
		// After - Boolean
		System.out.println(time2.isAfter(time));
		

	}

}
