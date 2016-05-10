package chapter2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ChapTest2_2 {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		System.out.println(now);
		LocalDate future = now.plusDays(100);
		DateTimeFormatter f =
				DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		System.out.println(future.format(f));
	}

}
