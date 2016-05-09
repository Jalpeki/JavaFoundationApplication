package chapter2;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class List2_3 {
	public static void main(String[] args) {
		LocalDateTime l1 = LocalDateTime.now();
		LocalDateTime l2 = LocalDateTime.of(2014, 1,1,9,5,0,0);

		ZonedDateTime z1 =l2.atZone(ZoneId.of("Europpe/London"));
		LocalDateTime l3 = z1.toLocalDateTime();
	}
}
