package chapter1;

public class List1_7 {
	public static void main(String[] args) {
		String s = "abc,def:ghi";
		String[] words = s.split("[,:]");
		System.out.println(words[1]);
		for(String w : words){
			System.out.print(w + "->");
		}
	}
}
