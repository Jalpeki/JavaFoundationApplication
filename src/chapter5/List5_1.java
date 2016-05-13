package chapter5;


public class List5_1 {
	public static void prints(Object a, Object b){
		for(int i = 0; i<(Integer)b; i++){
			System.out.println(a);
			System.out.println(b);
		}
	}
	public static void main(String[] args) {
		Object s = "こんにちわ";
		s = new Hero();
		Object n = 1;
		prints(s,n);
	}

}
