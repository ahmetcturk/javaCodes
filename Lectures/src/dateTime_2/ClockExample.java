package dateTime_2;

import java.time.*;

public class ClockExample {

	public static void main(String[] args) {
		
		
		Clock clock = Clock.system(ZoneId.of("America/Marigot"));
		
		
		Instant instant = clock.instant();
		System.out.println(instant); 
		
		clock = Clock.systemUTC();
		System.out.println(clock.getZone());

	}

}
