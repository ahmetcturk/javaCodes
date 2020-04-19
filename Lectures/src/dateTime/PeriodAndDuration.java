package dateTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.logging.Logger;

// This example demonstrates duration between time and dates
public class PeriodAndDuration {

	public static void main(String[] args) {
		
		LocalDate initialDate = LocalDate.now();
		LocalDate finalDate = initialDate.plus(Period.ofWeeks(4));// number*7 % 30
		
		int days = Period.between(initialDate, finalDate).getDays();
		System.out.println("Duration between the two date : " + days);
		long between = ChronoUnit.DAYS.between(initialDate, finalDate);
		System.out.println("Duration between the two date : " + between);
		
		LocalTime initialTime = LocalTime.now();
		LocalTime finalTime = initialTime.plus(Duration.ofSeconds(36));
		
		long seconds = Duration.between(initialTime, finalTime).getSeconds();
		System.out.println("Duration between the two time : " + seconds);
		
		long between2 = ChronoUnit.SECONDS.between(initialTime, finalTime);
		System.out.println("Duration between the two time : " + between2);
		
	}

}
