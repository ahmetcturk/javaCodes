package dateTime;

import java.time.LocalTime;

public class TimeConcept {

	public static void main(String[] args) {
		
		LocalTime time = LocalTime.now();
		// Time now
		System.out.println("Now time is : " + time);
		// Add an hour to our current time
		System.out.println("Meeting in next hour : " + time.plusHours(1));
	}

}
