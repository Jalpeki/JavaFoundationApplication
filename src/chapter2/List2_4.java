package chapter2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class List2_4 {
	public static void main(String[] args) {
		//文字列からLocalDateTimeを作成
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		System.out.println(f);
		LocalDateTime d = LocalDateTime.parse("2011/08/21",f);
		//1000日後を計算
		d = d.plusDays(1000);
		String str = d.format(f);
		System.out.println("１０００日後は" + str);

		//現在の時刻
		LocalDate now = LocalDate.now();
		//if(now.	isAfter(d)){
			System.out.println("nowはｄより新しい");
	//	}
	}
}
