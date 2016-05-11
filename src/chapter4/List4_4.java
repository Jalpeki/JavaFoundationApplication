package chapter4;

import java.util.HashSet;
import java.util.Set;

class Tom {
	public String name;
	int hp;
	public int hashCode() {
		int result = 37;
		result = result * 31 + name.hashCode();
		result = result * 31 + hp;
		return result;
	}
}

public class List4_4 {
	public static void main(String[] args) {
		Set<Tom> list = new HashSet<Tom>();
		Tom h1 = new Tom();
		h1.name = "ミナト";
		list.add(h1);
		System.out.println("要素数=" + list.size());
		h1 = new Tom();
		h1.name = "ミナト";
		list.remove(h1);
		System.out.println("要素数=" + list.size());
	}
}
