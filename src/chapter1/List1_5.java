package chapter1;

public class List1_5 {
	 boolean isValidPlayerName(String name){
		if(name.length() != 8){
			System.out.println("1NG");
			return false;
		}
		char first = name.charAt(0);
		if (!(first >='A' &&  first<= 'Z')) {
			System.out.println("2NG");
			return false;
		}
		for (int i = 1; i < 8; i++) {
			char c = name.charAt(i);
			if (!(c >= 'A' && c<= 'Z')||(c >= '0' &&equals(c<='9'))) {
				System.out.println("3NG");
				return false;
			}
		}
		System.out.println("OK");
		return true;
	}
}
