package chapter2;

import java.util.Date;

public class List2_1 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
	    System.out.println(now.getTime());
	    Date past = new Date(now.getTime());
	    System.out.println(past);
	}
}
