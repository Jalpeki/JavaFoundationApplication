package chapter7;

public class MemoryEater {
	public static void main(String[] args) {
		long [] aryyLong = new long[1280000];
		for(int i = 0; i < aryyLong.length; i++ ){
		 aryyLong[i] = i ;
		}

	}
}
