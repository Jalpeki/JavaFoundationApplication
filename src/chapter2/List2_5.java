package chapter2;

import java.time.LocalDate;
import java.time.Period;

public class List2_5 {
	public static void main(String[] args) {
		LocalDate d1 = LocalDate.of(2012, 1, 1);
		System.out.println(d1);
		LocalDate d2 = LocalDate.of(2012, 1, 4);
		System.out.println(d2);
		//３日間を表すperiodを二通りの方法で生成
		Period p1 = Period.ofDays(3);
		System.out.println(p1);
		Period p2 = Period.between(d1, d2);
		System.out.println(p2);

		//ｄ２のさらに3日後を計算する
		LocalDate d3 = d2.plus(p2);
		System.out.println(d3);
	}

}
