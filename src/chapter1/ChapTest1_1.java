package chapter1;

public class ChapTest1_1 {
	public static void main(String[] args) {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < 101; i++) {
			s.append(i+ ",");
		if (i==100) {
			System.out.println(s);
			}
		}
		String w =s.toString();
	   String[] a = w.split(",");
	   for (int i = 0; i < a.length; i++){
		      System.out.println(a[i]);
		    }
	}
}
