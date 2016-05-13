package chapter5;


public class List5_3 {
	public static void main(String[] args) {
		List5_2Pocket p = new List5_2Pocket();
		p.put("1192");
		String s = (String) p.get();
		System.out.println(s);
	}
}
