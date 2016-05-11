package chapter4;


public class Account implements Comparable<Account>{
	int number;

	public int compareto(Account obj){
		if (this.equals(number < obj.number)) {
			return -1;
		}
		if(this.number > obj.number){
			return 1 ;
		}
		return 0 ;
	}
}

public class List4_6 {
	public static void main(String[] args) {

	}

}
