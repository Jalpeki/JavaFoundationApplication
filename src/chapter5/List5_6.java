package chapter5;

public class List5_6 {
	public static void main(String[] args) {
		List5_4Pocket<String> p = new List5_4Pocket<String>();
		p.put("1192");
		String s = p.get();
		System.out.println(s);
	}

}
