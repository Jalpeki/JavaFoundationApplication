package chapter1;

public class List1_6 {
	public static void main(String[] args) {
		String s ="Java";
		s.matches("Java");
		s.matches("JavaJava");
		s.matches("java");
		String newName = "TOMATOSU";
		System.out.println(s);
		List1_5 n = new List1_5();
		n.isValidPlayerName(newName);
		isValidPlayerName(newName);



		}
	 static boolean isValidPlayerName(String name){
		return name.matches("[A-Z][A-Z0-9]{7}");
	}
}
