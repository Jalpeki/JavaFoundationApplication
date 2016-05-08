package chapter1;

public class List1_4 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		StringBuilder fd = new StringBuilder();
		for(int i = 0; i<1000; i++){
			if (i%10==0) {
				sb.append("  \n");
			}
			sb.append("Java");
		}
		fd.append("hellow").append("java").append("world");
		System.out.println(fd);
		String s = sb.toString();
		System.out.println(s);
	}
}
