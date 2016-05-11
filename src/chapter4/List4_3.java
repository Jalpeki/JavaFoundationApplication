package chapter4;

import java.util.ArrayList;
import java.util.List;

class Hero {
	public String name;

	public boolean equals(Object o) {
		return true;
	}
}

public class List4_3 {
	public static void main(String[] args) {
		List<Hero> list = new ArrayList<Hero>();
		Hero h1 = new Hero();
		h1.name = "ミナト";
		list.add(h1);
		System.out.println("要素数=" + list.size());
		h1 = new Hero();
		h1.name = "ミナト";
		list.remove(h1);
		System.out.println("要素数=" + list.size());
		int a=0x100;
		int b = 0x2;
		System.out.println(b);
		System.out.println(" int a = " + a );
	}
}


