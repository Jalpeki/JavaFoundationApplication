package chapter2;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class List2_2 {
	public static void main(String[] args) {
		Instant il =  Instant.now();
		Instant i2 = Instant.ofEpochMilli(319202919332L);
		long l = i2.toEpochMilli();
		ZonedDateTime z1 = ZonedDateTime.now();
		ZonedDateTime z2 = ZonedDateTime.of(2014, 1,2,3,4,5,6,ZoneId.of("Asia/Tokyo"));
		
		Instant i3 =z2.toInstant();
		ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));
		
		System.out.println("東京："  + z2.getYear() + z2.getMonth() + z2.getDayOfMonth());
		System.out.println("ロンドン：" + z3.getYear() + z3.getMonth() + z3.getDayOfMonth() );
	}

}
