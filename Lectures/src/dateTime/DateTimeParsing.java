package dateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateTimeParsing {

	public static void main(String[] args) {
		
		try {
			String dateStr = "Dec 20 2001 4 AD";
			LocalDate date = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("MMM dd yyyy Q G"));
			System.out.println(date);

			String timeStr = "10:23 PM";
			LocalTime time = LocalTime.parse(timeStr, DateTimeFormatter.ofPattern("hh:mm a"));
			System.out.println(time);
		} 
		catch (DateTimeParseException e) {
			System.out.println("Fail to parse.");
		}
	}

}
