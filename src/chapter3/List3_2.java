package chapter3;

import java.util.ArrayList;
import java.util.Iterator;


public class List3_2 {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("谷");
		names.add("斉藤");
		names.add("菅原");
		Iterator<String>it = names.iterator();
		while (it.hasNext()) {
			String e = it.next();
			System.out.println(e);
		}
	}
}
