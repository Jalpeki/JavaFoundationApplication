package chapter1;

public class List1_3 {
	public static void main(String[] args) {
		String s1 = "Java Programming";
		System.out.println("文字列S1の３文字目以降は" +
							s1.substring(3));
		System.out.println("文字列S1の３～８文字目は" +
							s1.substring(3, 8));
	}
}
